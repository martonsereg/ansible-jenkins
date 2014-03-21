def plugins = jenkins.model.Jenkins.instance.pluginManager.plugins
println plugins.find { it.getShortName() == args[0] } != null
