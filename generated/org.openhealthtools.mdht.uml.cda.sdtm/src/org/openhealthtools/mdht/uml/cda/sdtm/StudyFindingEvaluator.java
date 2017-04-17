/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Finding Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getStudyFindingEvaluator()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Study Finding Evaluator'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Study Finding EvaluatorTemplateId Study Finding EvaluatorTypeCode Study Finding EvaluatorRoleOfEvaluator' templateId.root='2.16.840.1.113883.10.20.23.84' typeCode='PRF'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudyFindingEvaluatorroleOfEvaluator constraints.validation.error='Study Finding EvaluatorroleOfEvaluatorTemplateId Study Finding EvaluatorroleOfEvaluatorClassCode Study Finding EvaluatorroleOfEvaluatorCode Study Finding EvaluatorroleOfEvaluatorCodeP' templateId.root='null' classCode='ASSIGNED' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus'"
 * @generated
 */
public interface StudyFindingEvaluator extends org.eclipse.mdht.uml.cda.Participant2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Study Finding EvaluatorTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.84\')'"
	 * @generated
	 */
	boolean validateStudyFindingEvaluatorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Study Finding EvaluatorTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeCode=vocab::ParticipationType::PRF'"
	 * @generated
	 */
	boolean validateStudyFindingEvaluatorTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Study Finding EvaluatorRoleOfEvaluator'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))'"
	 * @generated
	 */
	boolean validateStudyFindingEvaluatorRoleOfEvaluator(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyFindingEvaluator init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StudyFindingEvaluator init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // StudyFindingEvaluator
