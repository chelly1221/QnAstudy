// react
import React, { Component } from "react";

// components
import Content from "./components/Content";

/*
 * ES7-React-js-snippets
 * https://marketplace.visualstudio.com/items?itemName=dsznajder.es7-react-js-snippets
 * rcc 자동완성 : Class 기반 리액트 앱 뼈대 구성
 */
class App extends Component {
  render() {
    return (
      <div>
        <Content />
      </div>
    );
  }
}

export default App;
