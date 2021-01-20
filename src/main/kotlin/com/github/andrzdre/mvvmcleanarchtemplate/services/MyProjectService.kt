package com.github.andrzdre.mvvmcleanarchtemplate.services

import com.github.andrzdre.mvvmcleanarchtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
