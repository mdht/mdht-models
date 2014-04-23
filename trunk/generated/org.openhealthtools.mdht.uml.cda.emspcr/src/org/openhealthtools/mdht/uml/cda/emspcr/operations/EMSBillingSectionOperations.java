/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Billing Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#validateEMSBillingSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#validateEMSBillingSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#validateEMSBillingSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#validateEMSBillingSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#validateEMSBillingSectionBillingCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Billing Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#validateEMSBillingSectionLevelOfServiceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Level Of Service Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#getBillingCondition() <em>Get Billing Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection#getLevelOfServiceObservation() <em>Get Level Of Service Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSBillingSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSBillingSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSBillingSectionTemplateId(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSBillingSectionTemplateId(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSBillingSectionTemplateId(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSBillingSectionTemplateId(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsBillingSection The receiving '<em><b>EMS Billing Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSBillingSectionTemplateId(EMSBillingSection emsBillingSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_BILLING_SECTION);
			try {
				VALIDATE_EMS_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsBillingSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_BILLING_SECTION__EMS_BILLING_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EMSBillingSectionTemplateId"), new Object[] { emsBillingSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSBillingSectionCode(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSBillingSectionCode(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67659-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSBillingSectionCode(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSBillingSectionCode(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsBillingSection The receiving '<em><b>EMS Billing Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSBillingSectionCode(EMSBillingSection emsBillingSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_BILLING_SECTION);
			try {
				VALIDATE_EMS_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsBillingSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_BILLING_SECTION__EMS_BILLING_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSBillingSectionCode"), new Object[] { emsBillingSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSBillingSectionTitle(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSBillingSectionTitle(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Billing Section')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSBillingSectionTitle(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSBillingSectionTitle(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsBillingSection The receiving '<em><b>EMS Billing Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSBillingSectionTitle(EMSBillingSection emsBillingSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_BILLING_SECTION);
			try {
				VALIDATE_EMS_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsBillingSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_BILLING_SECTION__EMS_BILLING_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSBillingSectionTitle"), new Object[] { emsBillingSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSBillingSectionText(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSBillingSectionText(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSBillingSectionText(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSBillingSectionText(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsBillingSection The receiving '<em><b>EMS Billing Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSBillingSectionText(EMSBillingSection emsBillingSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_BILLING_SECTION);
			try {
				VALIDATE_EMS_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsBillingSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_BILLING_SECTION__EMS_BILLING_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSBillingSectionText"), new Object[] { emsBillingSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSBillingSectionBillingCondition(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Billing Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSBillingSectionBillingCondition(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::BillingCondition) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSBillingSectionBillingCondition(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Billing Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSBillingSectionBillingCondition(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsBillingSection The receiving '<em><b>EMS Billing Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSBillingSectionBillingCondition(EMSBillingSection emsBillingSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_BILLING_SECTION);
			try {
				VALIDATE_EMS_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsBillingSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_BILLING_SECTION__EMS_BILLING_SECTION_BILLING_CONDITION,
					EmspcrPlugin.INSTANCE.getString("EMSBillingSectionBillingCondition"),
					new Object[] { emsBillingSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSBillingSectionLevelOfServiceObservation(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Level Of Service Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSBillingSectionLevelOfServiceObservation(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::LevelOfServiceObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSBillingSectionLevelOfServiceObservation(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Billing Section Level Of Service Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSBillingSectionLevelOfServiceObservation(EMSBillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsBillingSection The receiving '<em><b>EMS Billing Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSBillingSectionLevelOfServiceObservation(EMSBillingSection emsBillingSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_BILLING_SECTION);
			try {
				VALIDATE_EMS_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsBillingSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_BILLING_SECTION__EMS_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION,
					EmspcrPlugin.INSTANCE.getString("EMSBillingSectionLevelOfServiceObservation"),
					new Object[] { emsBillingSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getBillingCondition(EMSBillingSection) <em>Get Billing Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingCondition(EMSBillingSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BILLING_CONDITION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::BillingCondition))->asSequence()->any(true).oclAsType(emspcr::BillingCondition)";

	/**
	 * The cached OCL query for the '{@link #getBillingCondition(EMSBillingSection) <em>Get Billing Condition</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingCondition(EMSBillingSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BILLING_CONDITION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static BillingCondition getBillingCondition(EMSBillingSection emsBillingSection) {
		if (GET_BILLING_CONDITION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_BILLING_SECTION,
				EmspcrPackage.Literals.EMS_BILLING_SECTION.getEAllOperations().get(61));
			try {
				GET_BILLING_CONDITION__EOCL_QRY = helper.createQuery(GET_BILLING_CONDITION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BILLING_CONDITION__EOCL_QRY);
		return (BillingCondition) query.evaluate(emsBillingSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getLevelOfServiceObservation(EMSBillingSection) <em>Get Level Of Service Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfServiceObservation(EMSBillingSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LEVEL_OF_SERVICE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::LevelOfServiceObservation))->asSequence()->any(true).oclAsType(emspcr::LevelOfServiceObservation)";

	/**
	 * The cached OCL query for the '{@link #getLevelOfServiceObservation(EMSBillingSection) <em>Get Level Of Service Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfServiceObservation(EMSBillingSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LEVEL_OF_SERVICE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static LevelOfServiceObservation getLevelOfServiceObservation(EMSBillingSection emsBillingSection) {
		if (GET_LEVEL_OF_SERVICE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_BILLING_SECTION,
				EmspcrPackage.Literals.EMS_BILLING_SECTION.getEAllOperations().get(62));
			try {
				GET_LEVEL_OF_SERVICE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_LEVEL_OF_SERVICE_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LEVEL_OF_SERVICE_OBSERVATION__EOCL_QRY);
		return (LevelOfServiceObservation) query.evaluate(emsBillingSection);
	}

} // EMSBillingSectionOperations
