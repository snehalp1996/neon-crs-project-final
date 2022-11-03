import React from "react";

import ReactDOM  from "react-dom";
import App from "./App.jsx";
import MyForm from "./Form.jsx";
import Customer from "./CustomerCurd.jsx";
import Employee from './MyComponentTwo.jsx';
import MyStateComponent from './StatefullComponent.jsx';
import UserList from './Fetch.jsx';
//import CreateUserComponent from './CreateUserComponent.jsx';
//import UpdateUserComponent from './UpdateUserComponent.jsx';
let emp={name:'ram',city: 'dubai'}
ReactDOM.render(<App name="snehal" age="25"/>,document.getElementById("app"));
ReactDOM.render(<MyForm />,document.getElementById("myform"));
ReactDOM.render(<Customer />,document.getElementById("curd"));
ReactDOM.render(<Employee emp={emp}/>,document.getElementById("render"));
ReactDOM.render(<MyStateComponent />,document.getElementById("state"));
ReactDOM.render(<UserList />,document.getElementById("rest"));
//ReactDOM.render(<CreateUserComponent />,document.getElementById("create"));
//ReactDOM.render(<UpdateUserComponent />,document.getElementById("update"));

