package com.github.mtwz.gormhelper.services

import com.intellij.openapi.project.Project
import com.github.mtwz.gormhelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
