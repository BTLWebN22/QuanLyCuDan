var api = "http://localhost:8080/danhsach/";
		let apiGet = api;
		let apiPost = api;
		let apiEdit = (index) => api + index;
		let apiDelete = (index) => api + index;

		function showAddContract() {
			document.querySelector('.container_input').classList.remove('hidden');
		}
		function hiddenAddStudent() {
			document.querySelector('.container_input').classList.add('hidden');
		}

		function showEditRow(index) {
			showAddContract();
			let dsTable = document.querySelector(`#row-${index}`).querySelectorAll('td');
			document.querySelector("#ten").value = dsTable[1].innerText;
			document.querySelector("#startdate").value = dsTable[2].innerDate;
			document.querySelector("#enddate").value = dsTable[3].innerDate;
			document.querySelector("#cost").value = dsTable[4].innerDouble;
			document.querySelector("#js-control_button").innerHTML = `
    <input class="submit" type="button" onclick="hiddenAddContract()" value="Thoát">        
    <input class="submit" type="button" onclick="putRow(${index})" value="Chỉnh sửa hợp đồng">`
		}

		function showAddRow() {
			showAddContract()
			document.querySelector("#js-control_button").innerHTML = `
    <input class="submit" type="button" onclick="hiddenAddContract()" value="Thoát">        
    <input class="submit" type="button" onclick="postRow()" value="Thêm hợp đồng">`
		}

		function addRow(id, name, startdate, enddate,cost) {
			let row = document.querySelector('#table').insertRow();
			row.setAttribute("class", "row");
			row.setAttribute("id", `row-${id}`);
			row.innerHTML = ` 
    <td >${id}</td>
    <td>${name}</td>
    <td>${startdate}</td>
    <td>${enddate}</td>
    <td>${cost}</td>
    <td><a class="link" onclick="showEditRow(${id})">Sửa</a></td>
    <td><a class="link" onclick="deleteRow(${id})">Xóa</a></td>
    `
		}

		function getContract() {
			fetch(apiGet)
				.then(response => response.json())
				.then((data) => {
					for (let contract of data) {
						addRow(contract.id, contract.name, contract.startdate, contract.enddate, contract.cost);
					}
				})
				.catch((error) => {
					console.error(error);
				})
		}
		getContract();

		function callAPI(data, method, apiSend, innerFunction) {
			fetch(apiSend, {
				method: method,
				headers: {
					"Content-Type": "application/json",
				},
				body: JSON.stringify(data)
			})
				.then(response => response.json())
				.then((data) => {
					innerFunction(data);
				})
				.catch((error) => {
					console.error(error);
				})
		}

		function postRow() {
			let data = {
				name: document.querySelector("#ten").value,
				startdate: document.querySelector("#startdate").value,
				enddate: document.querySelector("#enddate").value,
				cost: document.querySelector("#cost").value
			};
			callAPI(data, "POST", apiPost, (data) => {
				addRow(data.id, data.name, data.email);
				document.querySelector("#ten").value = "";
				document.querySelector("#startdate").value = "";
				document.querySelector("#enddate").value = "";
				document.querySelector("#cost").value = "";
				hiddenAddStudent();
			});
		}

		function putRow(index) {
			let data = {
				id: index,
				name: document.querySelector("#ten").value,
				startdate: document.querySelector("#startdate").value,
				enddate: document.querySelector("#enddate").value,
				cost: document.querySelector("#cost").value
			};
			callAPI(data, "PUT", apiEdit(index), (dataResponse) => {
				let dsTable = document.querySelector(`#row-${index}`).querySelectorAll('td');
				dsTable[1].innerText = data.name;
				dsTable[2].innerDate = data.startdate;
				dsTable[2].innerDate = data.enddate;
				dsTable[2].innerDouble = data.cost;
				document.querySelector("#ten").value = "";
				document.querySelector("#startdate").value = "";
				document.querySelector("#enddate").value = "";
				document.querySelector("#cost").value = "";
				hiddenAddContract();
			});
		}

		function deleteRow(index) {
			if (confirm(`Ban muon xoa hop dong co id ${index}`)) {
				callAPI(null, "DELETE", apiDelete(index), (data) => {
					document.querySelector(`#row-${index}`).remove();
				});
			}
		};