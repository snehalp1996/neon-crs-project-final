import React from "react";
//import Customer from "./component/Customer";
class App extends React.Component{


    render(){
        let companies=["Birlasoft", "IBM","US-Tech"];
    let myStyle={ 
        
        fontSize:50,
        color:"Red"

    }
        return(

            <div>
                
                <p>Hallo Neon React App</p>
            <h1>Expression--{2+2+2}</h1>
            <p> name={this.props.name}</p>
            <p> age={this.props.age}</p>


            <ul>
{companies.map(function (company,index) {
    return <li key={index}>{company}</li>
    })}





            </ul>
            </div>
        );
    }
}
export default App;