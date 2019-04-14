package projecttracker

class ListProjectsController {

    def index = {
        redirect(action: "current")
    }

    def current = {
        def projectName = "Project tracker Video Tutorials"
        def dueDate = "14 April 2019"
        [project:projectName, date:dueDate]
    }

    def overdue = {
        render "Order Boishaki package order"
    }
}
