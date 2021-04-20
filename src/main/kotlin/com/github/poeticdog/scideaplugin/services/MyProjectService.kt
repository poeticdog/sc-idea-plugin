package com.github.poeticdog.scideaplugin.services

import com.github.poeticdog.scideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
