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
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SupplyOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Medicinal Supply Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityProductInstanceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#validateNonMedicinalSupplyActivityProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity#getProductInstance() <em>Get Product Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonMedicinalSupplyActivityOperations extends SupplyOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected NonMedicinalSupplyActivityOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityProductInstanceTypeCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance Type Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityProductInstanceTypeCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(par : cda::Participant2 | par.participantRole.oclIsKindOf(consol::ProductInstance))->forAll(p : cda::Participant2 | p.typeCode=vocab::ParticipationType::PRD)";

	/**
	* The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityProductInstanceTypeCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance Type Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityProductInstanceTypeCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.participant->select(par : cda::Participant2 | par.participantRole.oclIsKindOf(consol::ProductInstance))->forAll(p : cda::Participant2 | p.typeCode=vocab::ParticipationType::PRD)
	* @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateNonMedicinalSupplyActivityProductInstanceTypeCode(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityProductInstanceTypeCode"),
					new Object[] { nonMedicinalSupplyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityTemplateId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityTemplateId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.50')";

	/**
	* The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityTemplateId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityTemplateId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.50')
	* @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateNonMedicinalSupplyActivityTemplateId(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityTemplateId"),
					new Object[] { nonMedicinalSupplyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityClassCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityClassCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	* The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityClassCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityClassCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* isDefined('classCode')
	* @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateNonMedicinalSupplyActivityClassCode(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityClassCode"),
					new Object[] { nonMedicinalSupplyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityMoodCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityMoodCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentSubstanceMood) and "
			+ "let value : vocab::x_DocumentSubstanceMood = self.moodCode.oclAsType(vocab::x_DocumentSubstanceMood) in "
			+ "value = vocab::x_DocumentSubstanceMood::EVN or value = vocab::x_DocumentSubstanceMood::INT";

	/**
	* The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityMoodCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityMoodCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentSubstanceMood) and 
	* let value : vocab::x_DocumentSubstanceMood = self.moodCode.oclAsType(vocab::x_DocumentSubstanceMood) in 
	* value = vocab::x_DocumentSubstanceMood::EVN or value = vocab::x_DocumentSubstanceMood::INT
	* @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateNonMedicinalSupplyActivityMoodCode(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityMoodCode"),
					new Object[] { nonMedicinalSupplyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityId(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	* @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateNonMedicinalSupplyActivityId(NonMedicinalSupplyActivity nonMedicinalSupplyActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_ID,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityId"),
					new Object[] { nonMedicinalSupplyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityStatusCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Status Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityStatusCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityStatusCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Status Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityStatusCode(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	* @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateNonMedicinalSupplyActivityStatusCode(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityStatusCode"),
					new Object[] { nonMedicinalSupplyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityEffectiveTime(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityEffectiveTime(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityEffectiveTime(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityEffectiveTime(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())
	* @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateNonMedicinalSupplyActivityEffectiveTime(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityEffectiveTime"),
					new Object[] { nonMedicinalSupplyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityQuantity(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityQuantity(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityQuantity(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Quantity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityQuantity(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())
	* @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateNonMedicinalSupplyActivityQuantity(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_QUANTITY,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityQuantity"),
					new Object[] { nonMedicinalSupplyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityProductInstance(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityProductInstance(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))";

	/**
	* The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityProductInstance(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateNonMedicinalSupplyActivityProductInstance(NonMedicinalSupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.participant->one(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))
	* @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateNonMedicinalSupplyActivityProductInstance(
			NonMedicinalSupplyActivity nonMedicinalSupplyActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY__NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityProductInstance"),
					new Object[] { nonMedicinalSupplyActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getProductInstance(NonMedicinalSupplyActivity) <em>Get Product Instance</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProductInstance(NonMedicinalSupplyActivity)
	* @generated
	* @ordered
	*/
	protected static final String GET_PRODUCT_INSTANCE__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance))->asSequence()->first().oclAsType(consol::ProductInstance)";

	/**
	* The cached OCL query for the '{@link #getProductInstance(NonMedicinalSupplyActivity) <em>Get Product Instance</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProductInstance(NonMedicinalSupplyActivity)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PRODUCT_INSTANCE__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance))->asSequence()->first().oclAsType(consol::ProductInstance)
	* @param nonMedicinalSupplyActivity The receiving '<em><b>Non Medicinal Supply Activity</b></em>' model object.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static ProductInstance getProductInstance(NonMedicinalSupplyActivity nonMedicinalSupplyActivity) {
		if (GET_PRODUCT_INSTANCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY,
				ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY.getEAllOperations().get(61));
			try {
				GET_PRODUCT_INSTANCE__EOCL_QRY = helper.createQuery(GET_PRODUCT_INSTANCE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRODUCT_INSTANCE__EOCL_QRY);
		return (ProductInstance) query.evaluate(nonMedicinalSupplyActivity);
	}

} // NonMedicinalSupplyActivityOperations
