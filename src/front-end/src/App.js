import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

import HomeComponent from './component/HomeComponent';

class App extends Component {

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
      
          <HomeComponent />
        </header>
      </div>
    );
  }
}
export default App;
