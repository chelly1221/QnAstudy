# React 기초 개념

- Editor : 2019.06.31 sponge
- GitHub : [github/devJRL](https://github.com/devJRL/)

## React는

웹 어플리케이션의 Front-end는 웹 서비스의 성장속도 맞추어 효과적으로 정리할 수 있는 기술을 원했습니다. 웹 화면은 HTML에 더한 혼란스러운 JavaScript 코드와 CSS로 엉키고 설혀서 새로운 페이지를 증설해내는데 더더욱 많은 시간을 투자해야만 했습니다.

한편, Google에서 개발한 V8 엔진을 통해 웹브라우저를 벗어나게된 JavaScript는 Node.js라는 이름으로 새로운 영역을 넓혀가고 있었고, 이 엔진을 이용한 새로운 방식의 웹화면 구축을 위해 웹 개발자들은 혼신의 노력을 다했습니다. 그 개발자 무리들 중 한 단체인 Facebook 개발팀은 JavaScript의 불변성(immunablity)라는 개념을 더욱 강하게 가꾸어 React라는 상태관리형 라이브러리를 개발해내었습니다.

React는 각 화면에서 사용되는 JavaScript를 class단위로 분할하고 export/import로 서로를 불러들여서 HTML을 Single Page로 다룰수 잇도록 만든 Node.js 라이브러리 입니다.

# state

class로 구분되어 react 라이브러리의 component를 상속받는 각각의 js파일들은 class를 export하고 서로 관계를 맺을 수 잇습니다. 각 클래스는 고유한 state(상태)를 가지고, nodejs 서버로 작동되는 서버에 특정 함수(setState())를 사용하지 않고는 절대 값을 변조할 수 없도록 관리됩니다. 저장되어진 값은 반드시 초기화되어야하므로 `constructor(props)`를 이용해서 초기화 시키고, `{this.state.key}`로 key라는 state에 해당하는 값을 읽을 수 있습니다.

# props

class가 App.js파일에 불러진 후, 해당 class 파일에서 다른 class파일를 내포하면 우리는 이를 두 class가 부모-자식 관계 혹은 상하관계를 가졌다고 말합니다. 이때 상위 컴포넌트의 state에 저장되어 있는 값을 하위 컴포넌트에게 `key={this.state.value}` 형태로 전달할 수 있는데, 이를 props락고 합니다. props를 받게되는 하위 컴포넌트는 this.props.key로 해당 전달됩 값(value)를 읽을 수 있습니다.

## App 실행방법

```bash
  # 디렉토리 만들기
  mkdir ~/qna-repo
  cd qna-repo

  # 깃허브 레포 내려받기
  git pull https://github.com/chelly1221/QnAstudy.git

  # React 서버 실행하기
  cd Node.js/sponge_react
  yarn start

  # yarn이 없는 사용자는 설치가 필요합니다.
  https://yarnpkg.com/en/docs/install
```
