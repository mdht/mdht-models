/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assessment And Plan Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAssessmentAndPlanSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AssessmentAndPlanSection2TemplateId AssessmentAndPlanSectionCode AssessmentAndPlanSectionCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.9' templateId.extension='2014-06-09' constraints.validation.dependOn.AssessmentAndPlanSectionCode='AssessmentAndPlanSectionCodeP' constraints.validation.info='AssessmentAndPlanSectionPlanOfCareActivityAct'"
 * @generated
 */
public interface AssessmentAndPlanSection2 extends AssessmentAndPlanSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.9\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAssessmentAndPlanSection2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedAct2)).oclAsType(consol::PlannedAct2)'"
	 * @generated
	 */
	EList<PlannedAct2> getConsolPlannedAct2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AssessmentAndPlanSection2
