// rcc
import React, { Component } from "react";

export default class Content extends Component {
  render() {
    return (
      <div>
        <font size="2" color="gray">
          아래 목록을 클릭하면 페이지의 state를 변경하는 함수를 호출합니다.
          <br />
          변경된 state 값에 따라서 아래 내용이 변경됩니다.
        </font>
        <ul>
          {this.props.index.map((contact, index) => {
            return (
              <li key={index}>
                <a
                  href="/"
                  onClick={e => {
                    e.preventDefault();
                    this.props.changeIndex(index);
                  }}
                >
                  {this.props.index[index].keyword}
                </a>
              </li>
            );
          })}
        </ul>
        <font size="4">
          {this.props.contents[this.props.nowIndex].emoji}&nbsp;&nbsp;
          {this.props.contents[this.props.nowIndex].comment}
        </font>
      </div>
    );
  }
}
