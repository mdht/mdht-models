/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chemotherapy Medication Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity#validateChemotherapyMedicationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity#validateChemotherapyMedicationActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity#validateChemotherapyMedicationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity#validateChemotherapyMedicationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity#validateChemotherapyMedicationActivityRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity#validateChemotherapyMedicationActivityClinicalDrugTrial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Clinical Drug Trial</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity#validateChemotherapyMedicationActivityChemotherapyProtocolReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Chemotherapy Protocol Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity#getClinicalDrugTrials() <em>Get Clinical Drug Trials</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity#getChemotherapyProtocolReferences() <em>Get Chemotherapy Protocol References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChemotherapyMedicationActivityOperations extends MedicationActivityOperations {
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
	protected ChemotherapyMedicationActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityDoseQuantity(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityDoseQuantity(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityDoseQuantity(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityDoseQuantity(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivity The receiving '<em><b>Chemotherapy Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityDoseQuantity(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_DOSE_QUANTITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityChemotherapyMedicationActivityDoseQuantity",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivity, context) }),
						new Object[] { chemotherapyMedicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityEffectiveTime(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityEffectiveTime(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityEffectiveTime(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityEffectiveTime(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivity The receiving '<em><b>Chemotherapy Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityEffectiveTime(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityChemotherapyMedicationActivityEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivity, context) }),
						new Object[] { chemotherapyMedicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityRepeatNumber(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityRepeatNumber(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityRepeatNumber(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityRepeatNumber(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivity The receiving '<em><b>Chemotherapy Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityRepeatNumber(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_REPEAT_NUMBER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityChemotherapyMedicationActivityRepeatNumber",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivity, context) }),
						new Object[] { chemotherapyMedicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivity The receiving '<em><b>Chemotherapy Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityRouteCodeP(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityChemotherapyMedicationActivityRouteCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivity, context) }),
						new Object[] { chemotherapyMedicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityRouteCode(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityRouteCode(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C38192' or value.code = 'C38193' or value.code = 'C38194' or value.code = 'C38675' or value.code = 'C38197' or value.code = 'C38633' or value.code = 'C38205' or value.code = 'C38206' or value.code = 'C38208' or value.code = 'C38209' or value.code = 'C38210' or value.code = 'C38211' or value.code = 'C38212' or value.code = 'C38200' or value.code = 'C38215' or value.code = 'C38219' or value.code = 'C38220' or value.code = 'C38221' or value.code = 'C38222' or value.code = 'C38223' or value.code = 'C38224' or value.code = 'C38225' or value.code = 'C38226' or value.code = 'C38227' or value.code = 'C38228' or value.code = 'C38229' or value.code = 'C38230' or value.code = 'C38231' or value.code = 'C38232' or value.code = 'C38233' or value.code = 'C38234' or value.code = 'C38217' or value.code = 'C38218' or value.code = 'C38235' or value.code = 'C38238' or value.code = 'C38239' or value.code = 'C38240' or value.code = 'C38241' or value.code = 'C38242' or value.code = 'C38243' or value.code = 'C38245' or value.code = 'C38246' or value.code = 'C38247' or value.code = 'C38249' or value.code = 'C38250' or value.code = 'C38251' or value.code = 'C38252' or value.code = 'C38253' or value.code = 'C38254' or value.code = 'C28161' or value.code = 'C38255' or value.code = 'C38256' or value.code = 'C38257' or value.code = 'C38258' or value.code = 'C38259' or value.code = 'C38260' or value.code = 'C38261' or value.code = 'C38262' or value.code = 'C38263' or value.code = 'C38264' or value.code = 'C38265' or value.code = 'C38266' or value.code = 'C38267' or value.code = 'C38207' or value.code = 'C38268' or value.code = 'C38269' or value.code = 'C38270' or value.code = 'C38272' or value.code = 'C38273' or value.code = 'C38276' or value.code = 'C38277' or value.code = 'C38278' or value.code = 'C38280' or value.code = 'C38203' or value.code = 'C38281' or value.code = 'C38282' or value.code = 'C38284' or value.code = 'C38285' or value.code = 'C48623' or value.code = 'C38286' or value.code = 'C38287' or value.code = 'C38288' or value.code = 'C38289' or value.code = 'C38291' or value.code = 'C38676' or value.code = 'C38292' or value.code = 'C38677' or value.code = 'C38293' or value.code = 'C38294' or value.code = 'C38295' or value.code = 'C38216' or value.code = 'C38296' or value.code = 'C38198' or value.code = 'C38297' or value.code = 'C38298' or value.code = 'C38299' or value.code = 'C38300' or value.code = 'C38301' or value.code = 'C38304' or value.code = 'C38305' or value.code = 'C38283' or value.code = 'C38307' or value.code = 'C38308' or value.code = 'C38309' or value.code = 'C38312' or value.code = 'C38271'))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityRouteCode(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityRouteCode(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityRouteCodeP(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Route Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityRouteCodeP(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityRouteCodeP(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Route Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityRouteCodeP(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivity The receiving '<em><b>Chemotherapy Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityRouteCode(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityChemotherapyMedicationActivityRouteCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivity, context) }),
						new Object[] { chemotherapyMedicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityClinicalDrugTrial(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Clinical Drug Trial</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityClinicalDrugTrial(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(clondata::ClinicalDrugTrial) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityClinicalDrugTrial(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Clinical Drug Trial</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityClinicalDrugTrial(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivity The receiving '<em><b>Chemotherapy Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityClinicalDrugTrial(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_CLINICAL_DRUG_TRIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_CLINICAL_DRUG_TRIAL,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityChemotherapyMedicationActivityClinicalDrugTrial",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivity, context) }),
						new Object[] { chemotherapyMedicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapyMedicationActivityChemotherapyProtocolReference(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Chemotherapy Protocol Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityChemotherapyProtocolReference(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_CHEMOTHERAPY_PROTOCOL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(clondata::ChemotherapyProtocolReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapyMedicationActivityChemotherapyProtocolReference(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapy Medication Activity Chemotherapy Protocol Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapyMedicationActivityChemotherapyProtocolReference(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_CHEMOTHERAPY_PROTOCOL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivity The receiving '<em><b>Chemotherapy Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapyMedicationActivityChemotherapyProtocolReference(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_CHEMOTHERAPY_PROTOCOL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity());
			try {
				VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_CHEMOTHERAPY_PROTOCOL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_CHEMOTHERAPY_PROTOCOL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPY_MEDICATION_ACTIVITY_CHEMOTHERAPY_PROTOCOL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_CHEMOTHERAPY_PROTOCOL_REFERENCE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityChemotherapyMedicationActivityChemotherapyProtocolReference",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivity, context) }),
						new Object[] { chemotherapyMedicationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getClinicalDrugTrials(ChemotherapyMedicationActivity) <em>Get Clinical Drug Trials</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalDrugTrials(ChemotherapyMedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CLINICAL_DRUG_TRIALS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(clondata::ClinicalDrugTrial)).oclAsType(clondata::ClinicalDrugTrial)";

	/**
	 * The cached OCL query for the '{@link #getClinicalDrugTrials(ChemotherapyMedicationActivity) <em>Get Clinical Drug Trials</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalDrugTrials(ChemotherapyMedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CLINICAL_DRUG_TRIALS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ClinicalDrugTrial> getClinicalDrugTrials(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity) {

		if (GET_CLINICAL_DRUG_TRIALS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity(),
				CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity().getEAllOperations().get(108));
			try {
				GET_CLINICAL_DRUG_TRIALS__EOCL_QRY = helper.createQuery(GET_CLINICAL_DRUG_TRIALS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CLINICAL_DRUG_TRIALS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ClinicalDrugTrial> result = (Collection<ClinicalDrugTrial>) query.evaluate(
			chemotherapyMedicationActivity);
		return new BasicEList.UnmodifiableEList<ClinicalDrugTrial>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getChemotherapyProtocolReferences(ChemotherapyMedicationActivity) <em>Get Chemotherapy Protocol References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemotherapyProtocolReferences(ChemotherapyMedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHEMOTHERAPY_PROTOCOL_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(clondata::ChemotherapyProtocolReference)).oclAsType(clondata::ChemotherapyProtocolReference)";

	/**
	 * The cached OCL query for the '{@link #getChemotherapyProtocolReferences(ChemotherapyMedicationActivity) <em>Get Chemotherapy Protocol References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemotherapyProtocolReferences(ChemotherapyMedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHEMOTHERAPY_PROTOCOL_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ChemotherapyProtocolReference> getChemotherapyProtocolReferences(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity) {

		if (GET_CHEMOTHERAPY_PROTOCOL_REFERENCES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity(),
				CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity().getEAllOperations().get(109));
			try {
				GET_CHEMOTHERAPY_PROTOCOL_REFERENCES__EOCL_QRY = helper.createQuery(
					GET_CHEMOTHERAPY_PROTOCOL_REFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CHEMOTHERAPY_PROTOCOL_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ChemotherapyProtocolReference> result = (Collection<ChemotherapyProtocolReference>) query.evaluate(
			chemotherapyMedicationActivity);
		return new BasicEList.UnmodifiableEList<ChemotherapyProtocolReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTemplateId(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.44')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTemplateId(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(ChemotherapyMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapyMedicationActivity The receiving '<em><b>Chemotherapy Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicationActivityTemplateId(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapyMedicationActivity());
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapyMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPY_MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapyMedicationActivityMedicationActivityTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapyMedicationActivity, context) }),
						new Object[] { chemotherapyMedicationActivity }));
			}

			return false;
		}
		return true;
	}

} // ChemotherapyMedicationActivityOperations
