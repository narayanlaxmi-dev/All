import React from "react";
import axios from "axios";

class Comp2 extends React.Component {
  constructor() {
    super();
    console.log(this);

    this.state = {
      api: [],
    };
  }

  // after constructor, api call
  componentDidMount() {
    axios
      .get("http://localhost:8080/show-users")
      .then((result) => {
        console.log(result);
        this.setState({ api: result.data });
      })
      .catch((error) => {});
  }
  render() {
    var record = this.state.api;
    return (
      <div>
        <h1>Class Component</h1>
        <ul>
          {record && record.map((val) => <li key={val.id}>{val.name}</li>)}
        </ul>
      </div>
    );
  }
}
export default Comp2;
