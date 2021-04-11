import React, { Component } from 'react';
import {Route} from 'react-router-dom'
import {Home, About, List} from '../pages';

class App extends Component {
    render() {
        return (
            <div>
                {/* exact : 주어진 경로와 정확히 맞아 떨어져야만 설정한 컴포넌트를 보여준다. */}
                <Route exact path="/" component={Home}/> 
                <Route path="/about" component={About}/>
                <Route path="/List" component={List}/>
            </div>
        );
    }
}

export default App;