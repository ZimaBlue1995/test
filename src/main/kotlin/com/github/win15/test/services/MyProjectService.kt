package com.github.win15.test.services

import com.intellij.openapi.project.Project
import com.github.win15.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
