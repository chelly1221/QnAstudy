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
  // init state
  constructor(props) {
    super(props);
    this.state = {
      head: {
        title: "Hello, React!",
        message: "Practice about React"
      },
      index: [
        { id: 0, keyword: "React" },
        { id: 1, keyword: "state" },
        { id: 2, keyword: "props" }
      ],
      nowIndex: 0,
      contents: [
        {
          id: 0,
          emoji: "🌿",
          comment: "'React'는 Node.js 기반 라이브러리입니다."
        },
        {
          id: 1,
          emoji: "🍀",
          comment: "'state'는 클래스에서 상태로 저장된 값입니다."
        },
        {
          id: 2,
          emoji: "🍃",
          comment: "'props'는 하위 클래스로 전달하는 값입니다."
        }
      ]
    };
  }

  changeIndex = num => {
    this.setState({ nowIndex: num });
    console.log("==> setState - nowIndex : ", num);
  };

  render() {
    return (
      <div>
        <h1>{this.state.head.title}</h1>
        <h4>{this.state.head.message}</h4>
        <Content
          index={this.state.index}
          changeIndex={this.changeIndex}
          nowIndex={this.state.nowIndex}
          contents={this.state.contents}
        />
      </div>
    );
  }
}

export default App;
