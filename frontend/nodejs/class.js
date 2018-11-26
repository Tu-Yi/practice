var student = require('./student');
var teacher = require('./teacher');


function add(students,teacherName){
    teacher.add(teacherName);
    students.forEach(
        function(item){
            student.add(item);
        }
    );
}

exports.add = add;