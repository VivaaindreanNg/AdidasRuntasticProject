import React, { Component } from 'react';
import axios from 'axios';


class HomeComponent extends Component {
    constructor(props) {
        super(props);

        this.state = {
            response: [],
            singleSession: []
        };

        this.findSessionById = this.findSessionById.bind(this);
    }

    componentDidMount = () => {
        this.findSessionById();
    }

    findSessionById = () => {
        const findByIdUri = "http://localhost:8080/api/sessions/609da233b09c88268c83736c";
        axios.get(findByIdUri)
            .then(res => {
                console.log(res.data);
                this.setState({ response: res.data });
            })
            .catch(err => {
                console.log(err);
            });
    }

    // invokeAPICalls = () => {
    //     console.log("Test")
    //     const findAllURI = "http://localhost:8080/api/sessions";
    //     axios.get(findAllURI)
    //          .then(res => {
    //             console.log(res.data); 
    //             this.setState({ response: res.data.payload });
    //          })
    //          .catch(err => {
    //             console.log(err);
    //          });
    //     console.log("Response:" + this.response);
    // }

    render() {
        return(
        <React.Fragment>
            <h1>List of Sessions:</h1>
            <div>
                <p>Session Retrieved</p>
                <p>Session Id: {this.state.response.id}</p>
                <p>Duration: {this.state.response.duration}</p>
                <p>Distance: {this.state.response.distance}</p>
                <p>Calories: {this.state.response.calories}</p>
                <p>Max Speed: {this.state.response.maxSpeed}</p>
            </div>
        </React.Fragment>
        );
    }
}

export default HomeComponent;