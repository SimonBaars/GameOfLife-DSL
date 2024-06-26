/*
 * generated by Xtext 2.19.0
 */
package persons.tasks.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import persons.tasks.taskDSL.Planning

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TaskDSLGenerator extends AbstractGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		 val root = resource.allContents.head as Planning;
		 if (root !== null) {
			 var path = "generated/" + resource.getURI().lastSegment + "/"
			 fsa.generateFile(path+"PlanningInfo.txt", TextGenerator.toText(root))
			 fsa.generateFile(path+"PlanningOverview.html",HtmlGenerator.toHtml(root))
		 }
	 }
}
