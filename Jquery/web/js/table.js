$(function () {

    initTable();
})

//初始化表格
function initTable() {

    for(var i=0;i<10;i++){
        //创建行
        var  tr= $("<tr></tr>" )
        //在行中创建列
        var  td1=$("<td><input type='checkbox'  oncancel='tongji()' onclick='priceTotal()'><img src='../img/d.jpg' width='50px;'height='50px'>"+i+"</td>")
        var  td2=$("<td>苹果真好吃</td>")
        var  td3=$("<td style='color: grey'>规格:默认<br/>尺寸:默认</td>")
        var  td4=$("<td>980</td>")
        var  td5=$("<td><input type='button' class='on-number' value='-' data-v='-1'>" +
            "<input type='text' value='1'>" +
            "<input type='button' class='on-number' value='+' data-v='1'>\n</td>")
        var  td6=$("<td style='color: red'>980</td>")
        var  td7=$("<td><a class='delete' href='#'>移除商品</a></td>")
        tr.append(td1);
        tr.append(td2);
        tr.append(td3);
        tr.append(td4);
        tr.append(td5);
        tr.append(td6);
        tr.append(td7);
        //将行元素追加到Tbody
        var tbody=$("tbody")
        tbody.append(tr);
    }

    //给删除绑定单机事件
    $(function () {

        //删除一行
        $('a.delete').click(function () {

            $(this).parent().parent().remove();
        })

        $('button.delete').click(function () {

           $("tbody").remove();
        })
    })
}
function tongji(){
    var checkeds=$("table:checked");
    alert(checkeds);
    var sumprice=0;
    var x=0;

    $.each(checkeds,function(i,n){
        n=$(n);
        var children=n.parent("td").children();
        var td4=children.eq(3);
        var td5=children.eq(4);
        var price=td4.text();
        var num=td5.text();
        x++;
        sumprice=sumprice+price*num;

    })
    alert(x);
    $("#sumprice").text(sumprice);
    $("#sumprice").css("color","red");
}

$(document.documentElement).on("click",".on-number",function () {
    var $val=$(this).siblings("input[type='text']"),
        val=parseInt($val.val(),10)+parseInt($(this).data("v"));
    $val.val(isNaN(val) ? 0 : val);
});


function priceTotal() {
    var checkeds=$("table:checked");
    alert(checkeds);
    var sumprice=0;
    var x=0;

    $.each(checkeds,function(i,n){
        n=$(n);
        var children=n.parent("td").children();
        var td4=children.eq(3);
        var td5=children.eq(4);
        var price=td4.text();
        var num=td5.children(1);
        x++;
        sumprice=sumprice+price*num;

    })
    alert(x);
    $("#sumprice").text(sumprice);
    $("#sumprice").css("color","red");

}