/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Assessment And Plan Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection#getPlanOfCareActivityProcedure() <em>Get Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection#getPlanOfCareActivitySubstanceAdministration() <em>Get Plan Of Care Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection#getPlanOfCareActivitySupply() <em>Get Plan Of Care Activity Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection#getProblemObservation() <em>Get Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentAndPlanSectionOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentAndPlanSectionOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentAndPlanSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getPlanOfCareActivityProcedure(AssessmentAndPlanSection)
	 * <em>Get Plan Of Care Activity Procedure</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPlanOfCareActivityProcedure(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivityProcedure)";

	/**
	 * The cached OCL query for the '
	 * {@link #getPlanOfCareActivityProcedure(AssessmentAndPlanSection)
	 * <em>Get Plan Of Care Activity Procedure</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPlanOfCareActivityProcedure(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not
	 * procedure.oclIsUndefined() and
	 * procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure
	 * ))->asSequence()-
	 * >any(true).oclAsType(consol::PlanOfCareActivityProcedure)
	 * 
	 * @param assessmentAndPlanSection
	 *            The receiving '<em><b>Assessment And Plan Section</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareActivityProcedure getPlanOfCareActivityProcedure(
			AssessmentAndPlanSection assessmentAndPlanSection) {
		if (GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION, Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(61));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY);
		return (PlanOfCareActivityProcedure) query.evaluate(assessmentAndPlanSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivitySubstanceAdministration(AssessmentAndPlanSection) <em>Get Plan Of Care Activity Substance Administration</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPlanOfCareActivitySubstanceAdministration(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlanOfCareActivitySubstanceAdministration))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivitySubstanceAdministration)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivitySubstanceAdministration(AssessmentAndPlanSection) <em>Get Plan Of Care Activity Substance Administration</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPlanOfCareActivitySubstanceAdministration(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration :
	 * cda::SubstanceAdministration | not
	 * substanceAdministration.oclIsUndefined() and
	 * substanceAdministration.oclIsKindOf
	 * (consol::PlanOfCareActivitySubstanceAdministration
	 * ))->asSequence()->any(true
	 * ).oclAsType(consol::PlanOfCareActivitySubstanceAdministration)
	 * 
	 * @param assessmentAndPlanSection
	 *            The receiving '<em><b>Assessment And Plan Section</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareActivitySubstanceAdministration getPlanOfCareActivitySubstanceAdministration(
			AssessmentAndPlanSection assessmentAndPlanSection) {
		if (GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION, Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(62));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY);
		return (PlanOfCareActivitySubstanceAdministration) query.evaluate(assessmentAndPlanSection);
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getPlanOfCareActivitySupply(AssessmentAndPlanSection)
	 * <em>Get Plan Of Care Activity Supply</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPlanOfCareActivitySupply(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlanOfCareActivitySupply))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivitySupply)";

	/**
	 * The cached OCL query for the '
	 * {@link #getPlanOfCareActivitySupply(AssessmentAndPlanSection)
	 * <em>Get Plan Of Care Activity Supply</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPlanOfCareActivitySupply(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not
	 * supply.oclIsUndefined() and
	 * supply.oclIsKindOf(consol::PlanOfCareActivitySupply
	 * ))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivitySupply)
	 * 
	 * @param assessmentAndPlanSection
	 *            The receiving '<em><b>Assessment And Plan Section</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PlanOfCareActivitySupply getPlanOfCareActivitySupply(
			AssessmentAndPlanSection assessmentAndPlanSection) {
		if (GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION, Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(63));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY);
		return (PlanOfCareActivitySupply) query.evaluate(assessmentAndPlanSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemObservation(AssessmentAndPlanSection) <em>Get Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservation(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation))->asSequence()->any(true).oclAsType(consol::ProblemObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemObservation(AssessmentAndPlanSection) <em>Get Problem Observation</em>}' query operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getProblemObservation(AssessmentAndPlanSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(consol::ProblemObservation
	 * ))->asSequence()->any(true).oclAsType(consol::ProblemObservation)
	 * 
	 * @param assessmentAndPlanSection
	 *            The receiving '<em><b>Assessment And Plan Section</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ProblemObservation getProblemObservation(
			AssessmentAndPlanSection assessmentAndPlanSection) {
		if (GET_PROBLEM_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION, Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION.getEAllOperations().get(64));
			try {
				GET_PROBLEM_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PROBLEM_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_OBSERVATION__EOCL_QRY);
		return (ProblemObservation) query.evaluate(assessmentAndPlanSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Template Id</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.9')
	 * 
	 * @param assessmentAndPlanSection
	 *            The receiving '<em><b>Assessment And Plan Section</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateAssessmentAndPlanSectionTemplateId(
			AssessmentAndPlanSection assessmentAndPlanSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.ASSESSMENT_AND_PLAN_SECTION);
			try {
				VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assessmentAndPlanSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AssessmentAndPlanSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(assessmentAndPlanSection, context) }),
						 new Object [] { assessmentAndPlanSection }));
			}
			 
			return false;
		}
		return true;
	}

} // AssessmentAndPlanSectionOperations