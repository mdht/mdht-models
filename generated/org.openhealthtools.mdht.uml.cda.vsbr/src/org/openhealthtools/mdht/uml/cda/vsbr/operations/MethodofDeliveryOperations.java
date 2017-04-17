/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Methodof Delivery</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryFinalRouteAndMethod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Final Route And Method</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryFetalPresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Fetal Presentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryHysterotomyHysterectomyAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Hysterotomy Hysterectomy Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodofDeliveryOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected MethodofDeliveryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMethodofDeliveryTemplateId(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryTemplateId(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.45')";

	/**
	 * The cached OCL invariant for the '{@link #validateMethodofDeliveryTemplateId(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryTemplateId(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param methodofDelivery The receiving '<em><b>Methodof Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMethodofDeliveryTemplateId(MethodofDelivery methodofDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.METHODOF_DELIVERY);
			try {
				VALIDATE_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(methodofDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.METHODOF_DELIVERY__METHODOF_DELIVERY_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MethodofDeliveryMethodofDeliveryTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										methodofDelivery, context) }),
						new Object[] { methodofDelivery }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMethodofDeliveryClassCode(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryClassCode(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::PROC";

	/**
	 * The cached OCL invariant for the '{@link #validateMethodofDeliveryClassCode(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryClassCode(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param methodofDelivery The receiving '<em><b>Methodof Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMethodofDeliveryClassCode(MethodofDelivery methodofDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.METHODOF_DELIVERY);
			try {
				VALIDATE_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(methodofDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.METHODOF_DELIVERY__METHODOF_DELIVERY_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MethodofDeliveryMethodofDeliveryClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										methodofDelivery, context) }),
						new Object[] { methodofDelivery }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMethodofDeliveryMoodCode(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryMoodCode(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentProcedureMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMethodofDeliveryMoodCode(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryMoodCode(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param methodofDelivery The receiving '<em><b>Methodof Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMethodofDeliveryMoodCode(MethodofDelivery methodofDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.METHODOF_DELIVERY);
			try {
				VALIDATE_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(methodofDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.METHODOF_DELIVERY__METHODOF_DELIVERY_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MethodofDeliveryMethodofDeliveryMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										methodofDelivery, context) }),
						new Object[] { methodofDelivery }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMethodofDeliveryCode(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryCode(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '72149-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMethodofDeliveryCode(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryCode(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param methodofDelivery The receiving '<em><b>Methodof Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMethodofDeliveryCode(MethodofDelivery methodofDelivery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.METHODOF_DELIVERY);
			try {
				VALIDATE_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			methodofDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.METHODOF_DELIVERY__METHODOF_DELIVERY_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MethodofDeliveryMethodofDeliveryCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										methodofDelivery, context) }),
						new Object[] { methodofDelivery }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMethodofDeliveryCodeP(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryCodeP(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_METHODOF_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMethodofDeliveryCodeP(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryCodeP(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_METHODOF_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param methodofDelivery The receiving '<em><b>Methodof Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMethodofDeliveryCodeP(MethodofDelivery methodofDelivery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_METHODOF_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.METHODOF_DELIVERY);
			try {
				VALIDATE_METHODOF_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_METHODOF_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_METHODOF_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			methodofDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.METHODOF_DELIVERY__METHODOF_DELIVERY_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MethodofDeliveryMethodofDeliveryCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										methodofDelivery, context) }),
						new Object[] { methodofDelivery }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMethodofDeliveryFinalRouteAndMethod(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Final Route And Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryFinalRouteAndMethod(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_METHODOF_DELIVERY_FINAL_ROUTE_AND_METHOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cda::Observation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMethodofDeliveryFinalRouteAndMethod(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Final Route And Method</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryFinalRouteAndMethod(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_METHODOF_DELIVERY_FINAL_ROUTE_AND_METHOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param methodofDelivery The receiving '<em><b>Methodof Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMethodofDeliveryFinalRouteAndMethod(MethodofDelivery methodofDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_METHODOF_DELIVERY_FINAL_ROUTE_AND_METHOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.METHODOF_DELIVERY);
			try {
				VALIDATE_METHODOF_DELIVERY_FINAL_ROUTE_AND_METHOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_METHODOF_DELIVERY_FINAL_ROUTE_AND_METHOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_METHODOF_DELIVERY_FINAL_ROUTE_AND_METHOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				methodofDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.METHODOF_DELIVERY__METHODOF_DELIVERY_FINAL_ROUTE_AND_METHOD,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MethodofDeliveryMethodofDeliveryFinalRouteAndMethod",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										methodofDelivery, context) }),
						new Object[] { methodofDelivery }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMethodofDeliveryFetalPresentation(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Fetal Presentation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryFetalPresentation(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_METHODOF_DELIVERY_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cda::Observation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMethodofDeliveryFetalPresentation(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Fetal Presentation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryFetalPresentation(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_METHODOF_DELIVERY_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param methodofDelivery The receiving '<em><b>Methodof Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMethodofDeliveryFetalPresentation(MethodofDelivery methodofDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_METHODOF_DELIVERY_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.METHODOF_DELIVERY);
			try {
				VALIDATE_METHODOF_DELIVERY_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_METHODOF_DELIVERY_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_METHODOF_DELIVERY_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				methodofDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.METHODOF_DELIVERY__METHODOF_DELIVERY_FETAL_PRESENTATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MethodofDeliveryMethodofDeliveryFetalPresentation",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										methodofDelivery, context) }),
						new Object[] { methodofDelivery }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMethodofDeliveryHysterotomyHysterectomyAssociation(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Hysterotomy Hysterectomy Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryHysterotomyHysterectomyAssociation(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_METHODOF_DELIVERY_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateMethodofDeliveryHysterotomyHysterectomyAssociation(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Hysterotomy Hysterectomy Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMethodofDeliveryHysterotomyHysterectomyAssociation(MethodofDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_METHODOF_DELIVERY_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param methodofDelivery The receiving '<em><b>Methodof Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMethodofDeliveryHysterotomyHysterectomyAssociation(MethodofDelivery methodofDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_METHODOF_DELIVERY_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.METHODOF_DELIVERY);
			try {
				VALIDATE_METHODOF_DELIVERY_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_METHODOF_DELIVERY_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_METHODOF_DELIVERY_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				methodofDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.METHODOF_DELIVERY__METHODOF_DELIVERY_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"MethodofDeliveryMethodofDeliveryHysterotomyHysterectomyAssociation",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										methodofDelivery, context) }),
						new Object[] { methodofDelivery }));
			}

			return false;
		}
		return true;
	}

} // MethodofDeliveryOperations
