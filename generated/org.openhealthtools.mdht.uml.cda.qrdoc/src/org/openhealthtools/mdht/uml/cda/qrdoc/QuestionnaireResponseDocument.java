/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Response Document</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage#getQuestionnaireResponseDocument()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='QuestionnaireResponseDocumentTemplateId QuestionnaireResponseDocumentQuestionnaireResponseSection' templateId.root='2.16.840.1.113883.10.20.33.1.1'"
 * @generated
 */
public interface QuestionnaireResponseDocument extends QuestionnaireResponseDocumentHeader {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrdoc::QuestionnaireResponseSection))'"
	 * @generated
	 */
	boolean validateQuestionnaireResponseDocumentQuestionnaireResponseSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qrdoc::QuestionnaireResponseSection))->asSequence()->any(true).oclAsType(qrdoc::QuestionnaireResponseSection)'"
	 * @generated
	 */
	QuestionnaireResponseSection getQuestionnaireResponseSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseDocument init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QuestionnaireResponseDocument init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // QuestionnaireResponseDocument
