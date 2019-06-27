// rcc
import React, { Component } from "react";

export default class Content extends Component {
  // init state
  constructor(props) {
    super(props);
    this.state = {
      head: {
        title: "Hello, React!",
        message: "Practice about React"
      },
      index: [
        { id: 0, keyword: "Index" },
        { id: 1, keyword: "state" },
        { id: 2, keyword: "props" }
      ],
      contents: [
        { id: 1, comment: "'state'는 클래스에서 상태로 저장된 값입니다." },
        { id: 2, comment: "'props'는 다른 클래스로 전달하는 값입니다." }
      ]
    };
  }
  render() {
    return (
      <div>
        <h1>{this.state.head.title}</h1>
        <h4>{this.state.head.message}</h4>
        <h2>{this.state.index[0].keyword}</h2>
        <article>
          <li>{this.state.index[1].keyword}</li>
          <li>{this.state.index[2].keyword}</li>
        </article>
      </div>
    );
  }
}
