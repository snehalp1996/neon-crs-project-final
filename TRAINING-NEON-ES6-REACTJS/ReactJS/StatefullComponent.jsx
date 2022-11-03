
import React from 'react';


class MyStateComponent extends React.Component {

   constructor(props){
   
    super(props);

     this.state= {

     	data:[]
     }

   this.updateState = this.updateState.bind(this);

   };
// write React even here 

updateState(){

// implementation here 
console.log(this.state);
console.log('update the state implemenation');

      var item = "setTime..." + Date.now();  // take dynamic value form object
      var myArray = this.state.data;
      myArray.push(item)
      this.setState({data: myArray}) 

}

render() {
    return(
        <div>

      <button  onClick ={this.updateState}>Updated state</button>
     
       <h1> {this.state.data}</h1>

       </div>
     );
  }
}
export default MyStateComponent;



