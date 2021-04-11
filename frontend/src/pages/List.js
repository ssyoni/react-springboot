import React from 'react';
import '../css/List.css';

const List = () => {
    return (
        <div>
           <h1>List</h1>

            <table className='table'>
            <tr>
                <th>글 번호</th>
                <th>글 제목</th>
                <th>글 작성자</th>
            </tr>
            <tr>
                <td>Jill</td>
                <td>Smith</td>
                <td>50</td>
            </tr>
            <tr>
                <td>Eve</td>
                <td>Jackson</td>
                <td>94</td>
            </tr>
            </table>
        </div>
    )
}

export default List;