package projecttracker

class ListProjectsController {

    def index = {
        redirect(action: "current")
    }

    def current = {
        render "Project tracker Video Tutorils"
    }

    def overdue = {
        render "Order Boishaki package order"
    }
}
