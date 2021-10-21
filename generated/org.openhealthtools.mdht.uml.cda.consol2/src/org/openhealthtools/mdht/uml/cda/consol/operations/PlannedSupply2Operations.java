/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Supply2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2MedInfoXorImmunXorProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Med Info Xor Immun Xor Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2RepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Quantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Product(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2PriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Indication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2PlannedCoverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Planned Coverage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductRecommended(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Recommended</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product Med Info2 Xor Immun Med Info2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlannedSupply2ProductManufacturedProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getProductInstance() <em>Get Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getPriorityPreferences() <em>Get Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#getPlannedCoverages() <em>Get Planned Coverages</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2#validatePlanOfCareActivitySupplyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedSupply2Operations extends PlanOfCareActivitySupplyOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedSupply2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2MedInfoXorImmunXorProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Med Info Xor Immun Xor Product Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2MedInfoXorImmunXorProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "( (not product.oclIsUndefined() or participant->size() > 0) and ( (product.manufacturedProduct.oclIsTypeOf(consol::MedicationInformation2)) or (product.manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation2)) or (participant.participantRole->select(oclIsTypeOf(consol::ProductInstance))->size() = 1) )) implies ( (product.manufacturedProduct.oclIsTypeOf(consol::MedicationInformation2)) xor (product.manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation2)) xor (participant.participantRole->select(oclIsTypeOf(consol::ProductInstance))->size() = 1) )";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2MedInfoXorImmunXorProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Med Info Xor Immun Xor Product Instance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2MedInfoXorImmunXorProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2MedInfoXorImmunXorProductInstance(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2MedInfoXorImmunXorProductInstance", "ERROR");

		if (VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_MED_INFO_XOR_IMMUN_XOR_PRODUCT_INSTANCE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedSupply2PlannedSupply2MedInfoXorImmunXorProductInstance"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2TemplateId(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2TemplateId(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.43' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2TemplateId(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2TemplateId(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2TemplateId(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2TemplateId", "ERROR");

		if (VALIDATE_PLANNED_SUPPLY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2TemplateId"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2StatusCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2StatusCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2StatusCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2StatusCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2StatusCode(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2StatusCode", "ERROR");

		if (VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2StatusCode"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2StatusCodeP(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2StatusCodeP(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2StatusCodeP(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2StatusCodeP(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2StatusCodeP(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2StatusCodeP", "ERROR");

		if (VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2StatusCodeP"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2EffectiveTime(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2EffectiveTime(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (( not self.effectiveTime->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2EffectiveTime(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2EffectiveTime(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2EffectiveTime(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2EffectiveTime", "WARNING");

		if (VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2EffectiveTime"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2RepeatNumber(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2RepeatNumber(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2RepeatNumber(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2RepeatNumber(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2RepeatNumber(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2RepeatNumber", "INFO");

		if (VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_REPEAT_NUMBER,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2RepeatNumber"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2Quantity(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Quantity(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2Quantity(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Quantity(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2Quantity(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2Quantity", "INFO");

		if (VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_SUPPLY2_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_QUANTITY,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2Quantity"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2Product(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Product(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product->one(product : cda::Product | not product.oclIsUndefined() and product.oclIsKindOf(cda::Product))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2Product(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Product(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2Product(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2Product", "INFO");

		if (VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_SUPPLY2_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PRODUCT,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2Product"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2Performer(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Performer(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2Performer(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Performer(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2Performer(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2Performer", "INFO");

		if (VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_SUPPLY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PERFORMER,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2Performer"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2AuthorParticipation(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2AuthorParticipation(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2AuthorParticipation(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2AuthorParticipation(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2AuthorParticipation(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2AuthorParticipation", "WARNING");

		if (VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2AuthorParticipation"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2ProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ProductInstance))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2ProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Instance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductInstance(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2ProductInstance(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2ProductInstance", "INFO");

		if (VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PRODUCT_INSTANCE,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2ProductInstance"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2PriorityPreference(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Priority Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2PriorityPreference(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2PriorityPreference(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Priority Preference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2PriorityPreference(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2PriorityPreference(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2PriorityPreference", "INFO");

		if (VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PRIORITY_PREFERENCE,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2PriorityPreference"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2Indication2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Indication2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Indication2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2Indication2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Indication2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Indication2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2Indication2(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2Indication2", "INFO");

		if (VALIDATE_PLANNED_SUPPLY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_INDICATION2,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2Indication2"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2Instruction2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Instruction2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2Instruction2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Instruction2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2Instruction2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2Instruction2(PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2Instruction2", "INFO");

		if (VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_INSTRUCTION2,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2Instruction2"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2PlannedCoverage(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Planned Coverage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2PlannedCoverage(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PlannedCoverage) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2PlannedCoverage(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Planned Coverage</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2PlannedCoverage(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2PlannedCoverage(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2PlannedCoverage", "INFO");

		if (VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_PLANNED_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PLANNED_COVERAGE,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2PlannedCoverage"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2ProductRecommended(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Recommended</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductRecommended(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product->one(product : cda::Product | not product.oclIsUndefined() and product.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2ProductRecommended(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Recommended</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductRecommended(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedSupply2ProductRecommended(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2ProductRecommended", "WARNING");

		if (VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_SUPPLY2_PRODUCT_RECOMMENDED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PRODUCT_RECOMMENDED,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2ProductRecommended"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product Med Info2 Xor Immun Med Info2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product->excluding(null).manufacturedProduct->excluding(null)->reject(oclIsTypeOf(consol::MedicationInformation2) xor oclIsTypeOf(consol::ImmunizationMedicationInformation2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product Med Info2 Xor Immun Med Info2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(
			PlannedSupply2 plannedSupply2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PlannedSupply2PlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2", "ERROR");

		if (VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			plannedSupply2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT_MED_INFO2_XOR_IMMUN_MED_INFO2,
							ConsolPlugin.INSTANCE.getString(
								"PlannedSupply2PlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedSupply2ProductManufacturedProduct(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductManufacturedProduct(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.product->excluding(null)->reject(manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(cda::ManufacturedProduct)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedSupply2ProductManufacturedProduct(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Supply2 Product Manufactured Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedSupply2ProductManufacturedProduct(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedSupply2ProductManufacturedProduct(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlannedSupply2ProductManufacturedProduct", "INFO");

		if (VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			plannedSupply2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_SUPPLY2__PLANNED_SUPPLY2_PRODUCT_MANUFACTURED_PRODUCT,
							ConsolPlugin.INSTANCE.getString("PlannedSupply2PlannedSupply2ProductManufacturedProduct"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProductInstance(PlannedSupply2) <em>Get Product Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstance(PlannedSupply2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRODUCT_INSTANCE__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance))->asSequence()->any(true).oclAsType(consol::ProductInstance)";

	/**
	 * The cached OCL query for the '{@link #getProductInstance(PlannedSupply2) <em>Get Product Instance</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstance(PlannedSupply2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRODUCT_INSTANCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProductInstance getProductInstance(PlannedSupply2 plannedSupply2) {

		if (GET_PRODUCT_INSTANCE__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_SUPPLY2,
				ConsolPackage.Literals.PLANNED_SUPPLY2.getEAllOperations().get(74));
			try {
				GET_PRODUCT_INSTANCE__EOCL_QRY = helper.createQuery(GET_PRODUCT_INSTANCE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PRODUCT_INSTANCE__EOCL_QRY);
		return (ProductInstance) query.evaluate(plannedSupply2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPriorityPreferences(PlannedSupply2) <em>Get Priority Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferences(PlannedSupply2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIORITY_PREFERENCES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)).oclAsType(consol::PriorityPreference)";

	/**
	 * The cached OCL query for the '{@link #getPriorityPreferences(PlannedSupply2) <em>Get Priority Preferences</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferences(PlannedSupply2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIORITY_PREFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PriorityPreference> getPriorityPreferences(PlannedSupply2 plannedSupply2) {

		if (GET_PRIORITY_PREFERENCES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_SUPPLY2,
				ConsolPackage.Literals.PLANNED_SUPPLY2.getEAllOperations().get(75));
			try {
				GET_PRIORITY_PREFERENCES__EOCL_QRY = helper.createQuery(GET_PRIORITY_PREFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PRIORITY_PREFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PriorityPreference> result = (Collection<PriorityPreference>) query.evaluate(plannedSupply2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndication2s(PlannedSupply2) <em>Get Indication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication2s(PlannedSupply2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)";

	/**
	 * The cached OCL query for the '{@link #getIndication2s(PlannedSupply2) <em>Get Indication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication2s(PlannedSupply2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication2> getIndication2s(PlannedSupply2 plannedSupply2) {

		if (GET_INDICATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_SUPPLY2,
				ConsolPackage.Literals.PLANNED_SUPPLY2.getEAllOperations().get(76));
			try {
				GET_INDICATION2S__EOCL_QRY = helper.createQuery(GET_INDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication2> result = (Collection<Indication2>) query.evaluate(plannedSupply2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstruction2s(PlannedSupply2) <em>Get Instruction2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(PlannedSupply2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTION2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getInstruction2s(PlannedSupply2) <em>Get Instruction2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(PlannedSupply2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Instruction2> getInstruction2s(PlannedSupply2 plannedSupply2) {

		if (GET_INSTRUCTION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_SUPPLY2,
				ConsolPackage.Literals.PLANNED_SUPPLY2.getEAllOperations().get(77));
			try {
				GET_INSTRUCTION2S__EOCL_QRY = helper.createQuery(GET_INSTRUCTION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INSTRUCTION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instruction2> result = (Collection<Instruction2>) query.evaluate(plannedSupply2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedCoverages(PlannedSupply2) <em>Get Planned Coverages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedCoverages(PlannedSupply2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_COVERAGES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedCoverage)).oclAsType(consol::PlannedCoverage)";

	/**
	 * The cached OCL query for the '{@link #getPlannedCoverages(PlannedSupply2) <em>Get Planned Coverages</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedCoverages(PlannedSupply2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_COVERAGES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedCoverage> getPlannedCoverages(PlannedSupply2 plannedSupply2) {

		if (GET_PLANNED_COVERAGES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_SUPPLY2,
				ConsolPackage.Literals.PLANNED_SUPPLY2.getEAllOperations().get(78));
			try {
				GET_PLANNED_COVERAGES__EOCL_QRY = helper.createQuery(GET_PLANNED_COVERAGES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLANNED_COVERAGES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedCoverage> result = (Collection<PlannedCoverage>) query.evaluate(plannedSupply2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivitySupplyMoodCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyMoodCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentSubstanceMood) and " +
			"let value : vocab::x_DocumentSubstanceMood = self.moodCode.oclAsType(vocab::x_DocumentSubstanceMood) in " +
			"value = vocab::x_DocumentSubstanceMood::INT or value = vocab::x_DocumentSubstanceMood::PRMS or value = vocab::x_DocumentSubstanceMood::PRP or value = vocab::x_DocumentSubstanceMood::RQO";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivitySupplyMoodCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySupplyMoodCode(PlannedSupply2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedSupply2 The receiving '<em><b>Planned Supply2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivitySupplyMoodCode(PlannedSupply2 plannedSupply2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlannedSupply2PlanOfCareActivitySupplyMoodCode", "ERROR");

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_SUPPLY2);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedSupply2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_SUPPLY2__PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("PlannedSupply2PlanOfCareActivitySupplyMoodCode"),
						new Object[] { plannedSupply2 }));
			}

			return false;
		}
		return true;
	}

} // PlannedSupply2Operations
