/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

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

import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Laborand Delivery Process</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessAttendantParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Attendant Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Characteristics Of Labor And Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessHomeBirthPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Home Birth Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessMaternalTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Maternal Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessParticipatingLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Participating Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessMaternalMorbidities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Maternal Morbidities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessRiskFactors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Risk Factors</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#getCharacteristicsOfLaborAndDeliveries() <em>Get Characteristics Of Labor And Deliveries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#getHomeBirthPlan() <em>Get Home Birth Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#getMaternalTransfer() <em>Get Maternal Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#getMaternalMorbiditiess() <em>Get Maternal Morbiditiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#getRiskFactorss() <em>Get Risk Factorss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaborandDeliveryProcessOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected LaborandDeliveryProcessOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessTemplateId(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessTemplateId(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.31')";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessTemplateId(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessTemplateId(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessTemplateId(LaborandDeliveryProcess laborandDeliveryProcess,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessClassCode(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessClassCode(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessClassCode(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessClassCode(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessClassCode(LaborandDeliveryProcess laborandDeliveryProcess,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCESS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessMoodCode(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessMoodCode(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessMoodCode(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessMoodCode(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessMoodCode(LaborandDeliveryProcess laborandDeliveryProcess,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessCodeP(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessCodeP(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessCodeP(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessCodeP(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessCodeP(LaborandDeliveryProcess laborandDeliveryProcess,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_LABORAND_DELIVERY_PROCESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessCode(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessCode(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '57074-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessCode(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessCode(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessCode(LaborandDeliveryProcess laborandDeliveryProcess,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_LABORAND_DELIVERY_PROCESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessAttendantParticipation(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Attendant Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessAttendantParticipation(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessAttendantParticipation(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Attendant Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessAttendantParticipation(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessAttendantParticipation(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCESS_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_ATTENDANT_PARTICIPATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessAttendantParticipation",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessEntryRelationship(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessEntryRelationship(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessEntryRelationship(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessEntryRelationship(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessEntryRelationship(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCESS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_ENTRY_RELATIONSHIP,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessEntryRelationship",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Characteristics Of Labor And Delivery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_CHARACTERISTICS_OF_LABOR_AND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::CharacteristicofLaborandDelivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Characteristics Of Labor And Delivery</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_CHARACTERISTICS_OF_LABOR_AND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_CHARACTERISTICS_OF_LABOR_AND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_CHARACTERISTICS_OF_LABOR_AND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCESS_CHARACTERISTICS_OF_LABOR_AND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_CHARACTERISTICS_OF_LABOR_AND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_CHARACTERISTICS_OF_LABOR_AND_DELIVERY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessHomeBirthPlan(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Home Birth Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessHomeBirthPlan(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::PlannedHomeBirth) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessHomeBirthPlan(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Home Birth Plan</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessHomeBirthPlan(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessHomeBirthPlan(LaborandDeliveryProcess laborandDeliveryProcess,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCESS_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_HOME_BIRTH_PLAN,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessHomeBirthPlan",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessMaternalTransfer(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Maternal Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessMaternalTransfer(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::MaternalTransfer) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessMaternalTransfer(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Maternal Transfer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessMaternalTransfer(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessMaternalTransfer(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_MATERNAL_TRANSFER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessMaternalTransfer",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessParticipatingLocation(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Participating Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessParticipatingLocation(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessParticipatingLocation(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Participating Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessParticipatingLocation(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessParticipatingLocation(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCESS_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_PARTICIPATING_LOCATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessParticipatingLocation",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessMaternalMorbidities(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Maternal Morbidities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessMaternalMorbidities(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::MaternalMorbidity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessMaternalMorbidities(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Maternal Morbidities</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessMaternalMorbidities(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessMaternalMorbidities(
			LaborandDeliveryProcess laborandDeliveryProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_MATERNAL_MORBIDITIES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessMaternalMorbidities",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcessRiskFactors(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Risk Factors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessRiskFactors(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCESS_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::PregnancyRiskFactor) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcessRiskFactors(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Risk Factors</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcessRiskFactors(LaborandDeliveryProcess, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCESS_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcess The receiving '<em><b>Laborand Delivery Process</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcessRiskFactors(LaborandDeliveryProcess laborandDeliveryProcess,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCESS_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCESS_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCESS_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCESS_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcess)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCESS__LABORAND_DELIVERY_PROCESS_RISK_FACTORS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcessLaborandDeliveryProcessRiskFactors",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcess, context) }),
						new Object[] { laborandDeliveryProcess }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCharacteristicsOfLaborAndDeliveries(LaborandDeliveryProcess) <em>Get Characteristics Of Labor And Deliveries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicsOfLaborAndDeliveries(LaborandDeliveryProcess)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHARACTERISTICS_OF_LABOR_AND_DELIVERIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::CharacteristicofLaborandDelivery)).oclAsType(vsbr::CharacteristicofLaborandDelivery)";

	/**
	 * The cached OCL query for the '{@link #getCharacteristicsOfLaborAndDeliveries(LaborandDeliveryProcess) <em>Get Characteristics Of Labor And Deliveries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicsOfLaborAndDeliveries(LaborandDeliveryProcess)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHARACTERISTICS_OF_LABOR_AND_DELIVERIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CharacteristicofLaborandDelivery> getCharacteristicsOfLaborAndDeliveries(
			LaborandDeliveryProcess laborandDeliveryProcess) {

		if (GET_CHARACTERISTICS_OF_LABOR_AND_DELIVERIES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS,
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS.getEAllOperations().get(64));
			try {
				GET_CHARACTERISTICS_OF_LABOR_AND_DELIVERIES__EOCL_QRY = helper.createQuery(
					GET_CHARACTERISTICS_OF_LABOR_AND_DELIVERIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CHARACTERISTICS_OF_LABOR_AND_DELIVERIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CharacteristicofLaborandDelivery> result = (Collection<CharacteristicofLaborandDelivery>) query.evaluate(
			laborandDeliveryProcess);
		return new BasicEList.UnmodifiableEList<CharacteristicofLaborandDelivery>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHomeBirthPlan(LaborandDeliveryProcess) <em>Get Home Birth Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeBirthPlan(LaborandDeliveryProcess)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOME_BIRTH_PLAN__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::PlannedHomeBirth))->asSequence()->any(true).oclAsType(vsbr::PlannedHomeBirth)";

	/**
	 * The cached OCL query for the '{@link #getHomeBirthPlan(LaborandDeliveryProcess) <em>Get Home Birth Plan</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeBirthPlan(LaborandDeliveryProcess)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOME_BIRTH_PLAN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlannedHomeBirth getHomeBirthPlan(LaborandDeliveryProcess laborandDeliveryProcess) {

		if (GET_HOME_BIRTH_PLAN__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS,
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS.getEAllOperations().get(65));
			try {
				GET_HOME_BIRTH_PLAN__EOCL_QRY = helper.createQuery(GET_HOME_BIRTH_PLAN__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HOME_BIRTH_PLAN__EOCL_QRY);
		return (PlannedHomeBirth) query.evaluate(laborandDeliveryProcess);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMaternalTransfer(LaborandDeliveryProcess) <em>Get Maternal Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaternalTransfer(LaborandDeliveryProcess)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MATERNAL_TRANSFER__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::MaternalTransfer))->asSequence()->any(true).oclAsType(vsbr::MaternalTransfer)";

	/**
	 * The cached OCL query for the '{@link #getMaternalTransfer(LaborandDeliveryProcess) <em>Get Maternal Transfer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaternalTransfer(LaborandDeliveryProcess)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MATERNAL_TRANSFER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MaternalTransfer getMaternalTransfer(LaborandDeliveryProcess laborandDeliveryProcess) {

		if (GET_MATERNAL_TRANSFER__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS,
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS.getEAllOperations().get(66));
			try {
				GET_MATERNAL_TRANSFER__EOCL_QRY = helper.createQuery(GET_MATERNAL_TRANSFER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MATERNAL_TRANSFER__EOCL_QRY);
		return (MaternalTransfer) query.evaluate(laborandDeliveryProcess);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMaternalMorbiditiess(LaborandDeliveryProcess) <em>Get Maternal Morbiditiess</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaternalMorbiditiess(LaborandDeliveryProcess)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MATERNAL_MORBIDITIESS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::MaternalMorbidity)).oclAsType(vsbr::MaternalMorbidity)";

	/**
	 * The cached OCL query for the '{@link #getMaternalMorbiditiess(LaborandDeliveryProcess) <em>Get Maternal Morbiditiess</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaternalMorbiditiess(LaborandDeliveryProcess)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MATERNAL_MORBIDITIESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MaternalMorbidity> getMaternalMorbiditiess(LaborandDeliveryProcess laborandDeliveryProcess) {

		if (GET_MATERNAL_MORBIDITIESS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS,
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS.getEAllOperations().get(67));
			try {
				GET_MATERNAL_MORBIDITIESS__EOCL_QRY = helper.createQuery(GET_MATERNAL_MORBIDITIESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MATERNAL_MORBIDITIESS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MaternalMorbidity> result = (Collection<MaternalMorbidity>) query.evaluate(laborandDeliveryProcess);
		return new BasicEList.UnmodifiableEList<MaternalMorbidity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getRiskFactorss(LaborandDeliveryProcess) <em>Get Risk Factorss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskFactorss(LaborandDeliveryProcess)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RISK_FACTORSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::PregnancyRiskFactor)).oclAsType(vsbr::PregnancyRiskFactor)";

	/**
	 * The cached OCL query for the '{@link #getRiskFactorss(LaborandDeliveryProcess) <em>Get Risk Factorss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskFactorss(LaborandDeliveryProcess)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RISK_FACTORSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PregnancyRiskFactor> getRiskFactorss(LaborandDeliveryProcess laborandDeliveryProcess) {

		if (GET_RISK_FACTORSS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS,
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCESS.getEAllOperations().get(68));
			try {
				GET_RISK_FACTORSS__EOCL_QRY = helper.createQuery(GET_RISK_FACTORSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_RISK_FACTORSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PregnancyRiskFactor> result = (Collection<PregnancyRiskFactor>) query.evaluate(
			laborandDeliveryProcess);
		return new BasicEList.UnmodifiableEList<PregnancyRiskFactor>(result.size(), result.toArray());
	}

} // LaborandDeliveryProcessOperations
