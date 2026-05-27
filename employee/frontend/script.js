function generate(){

    let id=

        document.getElementById(
            "empId").value;

    fetch(

        "http://localhost:8083/payslip/"+id)

        .then(

            response=>response.json())

        .then(

            data=>{

                document.getElementById(

                    "result"

                ).innerHTML=

                    "Name : "+

                    data.employeeName+

                    "<br>Salary : "+

                    data.salary+

                    "<br>Days : "+

                    data.daysPresent;

            });

}