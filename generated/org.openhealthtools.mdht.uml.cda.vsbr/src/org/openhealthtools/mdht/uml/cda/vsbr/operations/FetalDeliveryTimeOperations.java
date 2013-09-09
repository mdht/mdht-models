/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetal Delivery Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime#validateFetalDeliveryTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime#validateFetalDeliveryTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime#validateFetalDeliveryTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime#validateFetalDeliveryTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime#validateFetalDeliveryTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetalDeliveryTimeOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FetalDeliveryTimeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliveryTimeTemplateId(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliveryTimeTemplateId(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.23')";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliveryTimeTemplateId(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliveryTimeTemplateId(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FETAL_DELIVERY_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliveryTime The receiving '<em><b>Fetal Delivery Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliveryTimeTemplateId(FetalDeliveryTime fetalDeliveryTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_TIME);
			try {
				VALIDATE_FETAL_DELIVERY_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DELIVERY_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DELIVERY_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			fetalDeliveryTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.FETAL_DELIVERY_TIME__FETAL_DELIVERY_TIME_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FetalDeliveryTimeTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeliveryTime, context) }),
					new Object[] { fetalDeliveryTime }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliveryTimeMoodCode(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliveryTimeMoodCode(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliveryTimeMoodCode(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliveryTimeMoodCode(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FETAL_DELIVERY_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliveryTime The receiving '<em><b>Fetal Delivery Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliveryTimeMoodCode(FetalDeliveryTime fetalDeliveryTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_TIME);
			try {
				VALIDATE_FETAL_DELIVERY_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DELIVERY_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DELIVERY_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			fetalDeliveryTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.FETAL_DELIVERY_TIME__FETAL_DELIVERY_TIME_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FetalDeliveryTimeMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeliveryTime, context) }),
					new Object[] { fetalDeliveryTime }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliveryTimeCodeP(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliveryTimeCodeP(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliveryTimeCodeP(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliveryTimeCodeP(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FETAL_DELIVERY_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliveryTime The receiving '<em><b>Fetal Delivery Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliveryTimeCodeP(FetalDeliveryTime fetalDeliveryTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_TIME);
			try {
				VALIDATE_FETAL_DELIVERY_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DELIVERY_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DELIVERY_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			fetalDeliveryTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.FETAL_DELIVERY_TIME__FETAL_DELIVERY_TIME_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FetalDeliveryTimeCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeliveryTime, context) }),
					new Object[] { fetalDeliveryTime }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliveryTimeCode(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliveryTimeCode(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '11778-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliveryTimeCode(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliveryTimeCode(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FETAL_DELIVERY_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliveryTime The receiving '<em><b>Fetal Delivery Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliveryTimeCode(FetalDeliveryTime fetalDeliveryTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_TIME);
			try {
				VALIDATE_FETAL_DELIVERY_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DELIVERY_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DELIVERY_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			fetalDeliveryTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.FETAL_DELIVERY_TIME__FETAL_DELIVERY_TIME_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FetalDeliveryTimeCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeliveryTime, context) }),
					new Object[] { fetalDeliveryTime }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliveryTimeValue(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliveryTimeValue(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliveryTimeValue(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliveryTimeValue(FetalDeliveryTime, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FETAL_DELIVERY_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliveryTime The receiving '<em><b>Fetal Delivery Time</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliveryTimeValue(FetalDeliveryTime fetalDeliveryTime,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_TIME);
			try {
				VALIDATE_FETAL_DELIVERY_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FETAL_DELIVERY_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FETAL_DELIVERY_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			fetalDeliveryTime)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.FETAL_DELIVERY_TIME__FETAL_DELIVERY_TIME_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FetalDeliveryTimeValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(fetalDeliveryTime, context) }),
					new Object[] { fetalDeliveryTime }));
			}

			return false;
		}
		return true;
	}

} // FetalDeliveryTimeOperations
