selectPage.html = {
    title:
        '<table id="table-1">' +
        '   <tr>' +
        '       <td>' +
        '           <h3>IBM Emp: Home</h3>' +
        '           <h4>( MVC )</h4>' +
        '       </td>' +
        '   </tr>' +
        '</table>',
    content:
        '<p>This is the Home page for IBM Emp: Home</p>',
    dataSource:
        '<h3>資料查詢:</h3>' +
        '<ul>' +
        '   <li>' +
        '       <a href="#">List</a> all Emps.' +
        '       <br>' +
        '       <br>' +
        '   </li>' +
        '   <li>' +
        '       <FORM METHOD="post">' +
        '           <b>輸入員工編號 (如7001):</b>' +
        '           <input type="text" class="enterEmpNo">' +
        '           <input type="hidden" name="action" value="getOne_For_Display">' +
        '           <input type="submit" value="送出">' +
        '       </FORM>' +
        '   </li>' +
        '   <li>' +
        '       <FORM METHOD="post">' +
        '           <b>選擇員工編號:</b>' +
        '           <select size="1" class="selectEmpNo">' +
        '           </select>' +
        '           <input type="hidden" name="action" value="getOne_For_Display">' +
        '           <input type="submit" value="送出">' +
        '       </FORM>' +
        '   </li>' +
        '   <li>' +
        '       <FORM METHOD="post">' +
        '           <b>選擇員工姓名:</b>' +
        '           <select size="1" class="empName">' +
        '           </select>' +
        '           <input type="hidden" name="action" value="getOne_For_Display">' +
        '           <input type="submit" value="送出">' +
        '       </FORM>' +
        '   </li>' +
        '</ul>',
    staffManagement:
        '<h3>員工管理</h3>' +
        '<ul>' +
        '   <li><a href="#">Add</a> a new Emp.</li>' +
        '</ul>'
};