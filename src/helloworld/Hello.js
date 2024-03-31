// export function Hello(name){
   
//     return(<div>Hello {name}</div>);
// }
import  React from 'react';
export default class Hello extends React.Component {
    render() {
        console.log(this);
      return <h2>Hi, I am a </h2>;
    }
  }