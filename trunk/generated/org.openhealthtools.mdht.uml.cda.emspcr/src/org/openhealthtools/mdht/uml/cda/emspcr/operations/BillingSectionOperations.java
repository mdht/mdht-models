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
import org.openhealthtools.mdht.uml.cda.emspcr.BillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Billing Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#validateBillingSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#validateBillingSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#validateBillingSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#validateBillingSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#validateBillingSectionBillingCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Billing Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#validateBillingSectionLevelOfServiceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Level Of Service Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#getBillingCondition() <em>Get Billing Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection#getLevelOfServiceObservation() <em>Get Level Of Service Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillingSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillingSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBillingSectionTemplateId(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBillingSectionTemplateId(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateBillingSectionTemplateId(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBillingSectionTemplateId(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param billingSection The receiving '<em><b>Billing Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBillingSectionTemplateId(BillingSection billingSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BILLING_SECTION);
			try {
				VALIDATE_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BILLING_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			billingSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BILLING_SECTION__BILLING_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("BillingSectionTemplateId"), new Object[] { billingSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBillingSectionCode(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBillingSectionCode(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67659-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateBillingSectionCode(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBillingSectionCode(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param billingSection The receiving '<em><b>Billing Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBillingSectionCode(BillingSection billingSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BILLING_SECTION);
			try {
				VALIDATE_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BILLING_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(billingSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BILLING_SECTION__BILLING_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("BillingSectionCode"), new Object[] { billingSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBillingSectionTitle(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBillingSectionTitle(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Billing Section')";

	/**
	 * The cached OCL invariant for the '{@link #validateBillingSectionTitle(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBillingSectionTitle(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param billingSection The receiving '<em><b>Billing Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBillingSectionTitle(BillingSection billingSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BILLING_SECTION);
			try {
				VALIDATE_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BILLING_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(billingSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BILLING_SECTION__BILLING_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("BillingSectionTitle"), new Object[] { billingSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBillingSectionText(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBillingSectionText(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateBillingSectionText(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBillingSectionText(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param billingSection The receiving '<em><b>Billing Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBillingSectionText(BillingSection billingSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BILLING_SECTION);
			try {
				VALIDATE_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BILLING_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(billingSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BILLING_SECTION__BILLING_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("BillingSectionText"), new Object[] { billingSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBillingSectionBillingCondition(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Billing Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBillingSectionBillingCondition(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::BillingCondition) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateBillingSectionBillingCondition(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Billing Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBillingSectionBillingCondition(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param billingSection The receiving '<em><b>Billing Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBillingSectionBillingCondition(BillingSection billingSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BILLING_SECTION);
			try {
				VALIDATE_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BILLING_SECTION_BILLING_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			billingSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BILLING_SECTION__BILLING_SECTION_BILLING_CONDITION,
					EmspcrPlugin.INSTANCE.getString("BillingSectionBillingCondition"), new Object[] { billingSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBillingSectionLevelOfServiceObservation(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Level Of Service Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBillingSectionLevelOfServiceObservation(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::LevelOfServiceObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateBillingSectionLevelOfServiceObservation(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Section Level Of Service Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBillingSectionLevelOfServiceObservation(BillingSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param billingSection The receiving '<em><b>Billing Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBillingSectionLevelOfServiceObservation(BillingSection billingSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BILLING_SECTION);
			try {
				VALIDATE_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			billingSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.BILLING_SECTION__BILLING_SECTION_LEVEL_OF_SERVICE_OBSERVATION,
					EmspcrPlugin.INSTANCE.getString("BillingSectionLevelOfServiceObservation"),
					new Object[] { billingSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getBillingCondition(BillingSection) <em>Get Billing Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingCondition(BillingSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BILLING_CONDITION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::BillingCondition))->asSequence()->any(true).oclAsType(emspcr::BillingCondition)";

	/**
	 * The cached OCL query for the '{@link #getBillingCondition(BillingSection) <em>Get Billing Condition</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingCondition(BillingSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BILLING_CONDITION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static BillingCondition getBillingCondition(BillingSection billingSection) {
		if (GET_BILLING_CONDITION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.BILLING_SECTION,
				EmspcrPackage.Literals.BILLING_SECTION.getEAllOperations().get(61));
			try {
				GET_BILLING_CONDITION__EOCL_QRY = helper.createQuery(GET_BILLING_CONDITION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BILLING_CONDITION__EOCL_QRY);
		return (BillingCondition) query.evaluate(billingSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getLevelOfServiceObservation(BillingSection) <em>Get Level Of Service Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfServiceObservation(BillingSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LEVEL_OF_SERVICE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::LevelOfServiceObservation))->asSequence()->any(true).oclAsType(emspcr::LevelOfServiceObservation)";

	/**
	 * The cached OCL query for the '{@link #getLevelOfServiceObservation(BillingSection) <em>Get Level Of Service Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfServiceObservation(BillingSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LEVEL_OF_SERVICE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static LevelOfServiceObservation getLevelOfServiceObservation(BillingSection billingSection) {
		if (GET_LEVEL_OF_SERVICE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.BILLING_SECTION,
				EmspcrPackage.Literals.BILLING_SECTION.getEAllOperations().get(62));
			try {
				GET_LEVEL_OF_SERVICE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_LEVEL_OF_SERVICE_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LEVEL_OF_SERVICE_OBSERVATION__EOCL_QRY);
		return (LevelOfServiceObservation) query.evaluate(billingSection);
	}

} // BillingSectionOperations
