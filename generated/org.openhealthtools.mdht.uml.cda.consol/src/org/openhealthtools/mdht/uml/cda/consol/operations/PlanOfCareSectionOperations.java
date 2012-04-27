/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivitySupply(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityAct() <em>Get Plan Of Care Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityEncounter() <em>Get Plan Of Care Activity Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityObservation() <em>Get Plan Of Care Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityProcedure() <em>Get Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivitySubstanceAdministration() <em>Get Plan Of Care Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivitySupply() <em>Get Plan Of Care Activity Supply</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfCareSectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PlanOfCareSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validatePlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.10')";

	/**
	* The cached OCL invariant for the '{@link #validatePlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionTemplateId(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.10')
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePlanOfCareSectionTemplateId(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionTemplateId"), new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePlanOfCareSectionCode(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionCode(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '18776-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validatePlanOfCareSectionCode(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionCode(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	* value.code = '18776-5' and value.codeSystem = '2.16.840.1.113883.6.1')
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePlanOfCareSectionCode(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionCode"), new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePlanOfCareSectionText(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionText(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validatePlanOfCareSectionText(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionText(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* not self.text.oclIsUndefined()
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePlanOfCareSectionText(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionText"), new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PlanOfCareActivityAct))";

	/**
	* The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PlanOfCareActivityAct))
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareActivityAct"),
					new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::PlanOfCareActivityEncounter))";

	/**
	* The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.entry->one(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::PlanOfCareActivityEncounter))
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareActivityEncounter"),
					new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PlanOfCareActivityObservation))";

	/**
	* The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PlanOfCareActivityObservation))
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareActivityObservation"),
					new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure))";

	/**
	* The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.entry->one(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure))
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareActivityProcedure"),
					new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::PlanOfCareActivitySubstanceAdministration))";

	/**
	* The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.entry->one(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::PlanOfCareActivitySubstanceAdministration))
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
			PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareActivitySubstanceAdministration"),
					new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::PlanOfCareActivitySupply))";

	/**
	* The cached OCL invariant for the '{@link #validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.entry->one(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::PlanOfCareActivitySupply))
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfCareSection planOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_SECTION);
			try {
				VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY,
					ConsolPlugin.INSTANCE.getString("PlanOfCareSectionPlanOfCareActivitySupply"),
					new Object[] { planOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getPlanOfCareActivityAct(PlanOfCareSection) <em>Get Plan Of Care Activity Act</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareActivityAct(PlanOfCareSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlanOfCareActivityAct))->asSequence()->first().oclAsType(consol::PlanOfCareActivityAct)";

	/**
	* The cached OCL query for the '{@link #getPlanOfCareActivityAct(PlanOfCareSection) <em>Get Plan Of Care Activity Act</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareActivityAct(PlanOfCareSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlanOfCareActivityAct))->asSequence()->first().oclAsType(consol::PlanOfCareActivityAct)
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static PlanOfCareActivityAct getPlanOfCareActivityAct(PlanOfCareSection planOfCareSection) {
		if (GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(64));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY);
		return (PlanOfCareActivityAct) query.evaluate(planOfCareSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getPlanOfCareActivityEncounter(PlanOfCareSection) <em>Get Plan Of Care Activity Encounter</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareActivityEncounter(PlanOfCareSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlanOfCareActivityEncounter))->asSequence()->first().oclAsType(consol::PlanOfCareActivityEncounter)";

	/**
	* The cached OCL query for the '{@link #getPlanOfCareActivityEncounter(PlanOfCareSection) <em>Get Plan Of Care Activity Encounter</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareActivityEncounter(PlanOfCareSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlanOfCareActivityEncounter))->asSequence()->first().oclAsType(consol::PlanOfCareActivityEncounter)
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static PlanOfCareActivityEncounter getPlanOfCareActivityEncounter(PlanOfCareSection planOfCareSection) {
		if (GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(65));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY);
		return (PlanOfCareActivityEncounter) query.evaluate(planOfCareSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getPlanOfCareActivityObservation(PlanOfCareSection) <em>Get Plan Of Care Activity Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareActivityObservation(PlanOfCareSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlanOfCareActivityObservation))->asSequence()->first().oclAsType(consol::PlanOfCareActivityObservation)";

	/**
	* The cached OCL query for the '{@link #getPlanOfCareActivityObservation(PlanOfCareSection) <em>Get Plan Of Care Activity Observation</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareActivityObservation(PlanOfCareSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlanOfCareActivityObservation))->asSequence()->first().oclAsType(consol::PlanOfCareActivityObservation)
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static PlanOfCareActivityObservation getPlanOfCareActivityObservation(PlanOfCareSection planOfCareSection) {
		if (GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(66));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY);
		return (PlanOfCareActivityObservation) query.evaluate(planOfCareSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getPlanOfCareActivityProcedure(PlanOfCareSection) <em>Get Plan Of Care Activity Procedure</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareActivityProcedure(PlanOfCareSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure))->asSequence()->first().oclAsType(consol::PlanOfCareActivityProcedure)";

	/**
	* The cached OCL query for the '{@link #getPlanOfCareActivityProcedure(PlanOfCareSection) <em>Get Plan Of Care Activity Procedure</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareActivityProcedure(PlanOfCareSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure))->asSequence()->first().oclAsType(consol::PlanOfCareActivityProcedure)
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static PlanOfCareActivityProcedure getPlanOfCareActivityProcedure(PlanOfCareSection planOfCareSection) {
		if (GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(67));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY);
		return (PlanOfCareActivityProcedure) query.evaluate(planOfCareSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getPlanOfCareActivitySubstanceAdministration(PlanOfCareSection) <em>Get Plan Of Care Activity Substance Administration</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareActivitySubstanceAdministration(PlanOfCareSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlanOfCareActivitySubstanceAdministration))->asSequence()->first().oclAsType(consol::PlanOfCareActivitySubstanceAdministration)";

	/**
	* The cached OCL query for the '{@link #getPlanOfCareActivitySubstanceAdministration(PlanOfCareSection) <em>Get Plan Of Care Activity Substance Administration</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareActivitySubstanceAdministration(PlanOfCareSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlanOfCareActivitySubstanceAdministration))->asSequence()->first().oclAsType(consol::PlanOfCareActivitySubstanceAdministration)
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static PlanOfCareActivitySubstanceAdministration getPlanOfCareActivitySubstanceAdministration(
			PlanOfCareSection planOfCareSection) {
		if (GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(68));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY);
		return (PlanOfCareActivitySubstanceAdministration) query.evaluate(planOfCareSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getPlanOfCareActivitySupply(PlanOfCareSection) <em>Get Plan Of Care Activity Supply</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareActivitySupply(PlanOfCareSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlanOfCareActivitySupply))->asSequence()->first().oclAsType(consol::PlanOfCareActivitySupply)";

	/**
	* The cached OCL query for the '{@link #getPlanOfCareActivitySupply(PlanOfCareSection) <em>Get Plan Of Care Activity Supply</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareActivitySupply(PlanOfCareSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlanOfCareActivitySupply))->asSequence()->first().oclAsType(consol::PlanOfCareActivitySupply)
	* @param planOfCareSection The receiving '<em><b>Plan Of Care Section</b></em>' model object.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static PlanOfCareActivitySupply getPlanOfCareActivitySupply(PlanOfCareSection planOfCareSection) {
		if (GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION,
				ConsolPackage.Literals.PLAN_OF_CARE_SECTION.getEAllOperations().get(69));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY);
		return (PlanOfCareActivitySupply) query.evaluate(planOfCareSection);
	}

} // PlanOfCareSectionOperations
