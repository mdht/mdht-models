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

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Abnormal Conditionofthe Newborn</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbnormalConditionoftheNewbornOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbnormalConditionoftheNewbornOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbnormalConditionoftheNewbornTemplateId(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornTemplateId(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateAbnormalConditionoftheNewbornTemplateId(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornTemplateId(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abnormalConditionoftheNewborn The receiving '<em><b>Abnormal Conditionofthe Newborn</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbnormalConditionoftheNewbornTemplateId(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONOFTHE_NEWBORN);
			try {
				VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			abnormalConditionoftheNewborn)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AbnormalConditionoftheNewbornTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									abnormalConditionoftheNewborn, context) }),
					new Object[] { abnormalConditionoftheNewborn }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbnormalConditionoftheNewbornClassCode(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornClassCode(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateAbnormalConditionoftheNewbornClassCode(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornClassCode(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abnormalConditionoftheNewborn The receiving '<em><b>Abnormal Conditionofthe Newborn</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbnormalConditionoftheNewbornClassCode(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONOFTHE_NEWBORN);
			try {
				VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			abnormalConditionoftheNewborn)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AbnormalConditionoftheNewbornClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									abnormalConditionoftheNewborn, context) }),
					new Object[] { abnormalConditionoftheNewborn }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbnormalConditionoftheNewbornMoodCode(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornMoodCode(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAbnormalConditionoftheNewbornMoodCode(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornMoodCode(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abnormalConditionoftheNewborn The receiving '<em><b>Abnormal Conditionofthe Newborn</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbnormalConditionoftheNewbornMoodCode(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONOFTHE_NEWBORN);
			try {
				VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			abnormalConditionoftheNewborn)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AbnormalConditionoftheNewbornMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									abnormalConditionoftheNewborn, context) }),
					new Object[] { abnormalConditionoftheNewborn }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbnormalConditionoftheNewbornCodeP(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornCodeP(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAbnormalConditionoftheNewbornCodeP(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornCodeP(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abnormalConditionoftheNewborn The receiving '<em><b>Abnormal Conditionofthe Newborn</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbnormalConditionoftheNewbornCodeP(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONOFTHE_NEWBORN);
			try {
				VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			abnormalConditionoftheNewborn)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AbnormalConditionoftheNewbornCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									abnormalConditionoftheNewborn, context) }),
					new Object[] { abnormalConditionoftheNewborn }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbnormalConditionoftheNewbornCode(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornCode(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '73812-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAbnormalConditionoftheNewbornCode(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornCode(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abnormalConditionoftheNewborn The receiving '<em><b>Abnormal Conditionofthe Newborn</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbnormalConditionoftheNewbornCode(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONOFTHE_NEWBORN);
			try {
				VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			abnormalConditionoftheNewborn)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AbnormalConditionoftheNewbornCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									abnormalConditionoftheNewborn, context) }),
					new Object[] { abnormalConditionoftheNewborn }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbnormalConditionoftheNewbornCodeVS(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Code VS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornCodeVS(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = 'PHC1250' or value.code = 'PHC1251' or value.code = '405269005' or value.code = '43470100012410' or value.code = '434621000124103' or value.code = '91175000' or value.code = '56110009' or value.code = '260413007'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAbnormalConditionoftheNewbornCodeVS(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Code VS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornCodeVS(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abnormalConditionoftheNewborn The receiving '<em><b>Abnormal Conditionofthe Newborn</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbnormalConditionoftheNewbornCodeVS(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONOFTHE_NEWBORN);
			try {
				VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			abnormalConditionoftheNewborn)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_VS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AbnormalConditionoftheNewbornCodeVS",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									abnormalConditionoftheNewborn, context) }),
					new Object[] { abnormalConditionoftheNewborn }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbnormalConditionoftheNewbornValue(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornValue(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = 'PHC1250' or value.code = 'PHC1251' or value.code = '405269005' or value.code = '43470100012410' or value.code = '434621000124103' or value.code = '91175000' or value.code = '56110009' or value.code = '260413007')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAbnormalConditionoftheNewbornValue(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornValue(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abnormalConditionoftheNewborn The receiving '<em><b>Abnormal Conditionofthe Newborn</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbnormalConditionoftheNewbornValue(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONOFTHE_NEWBORN);
			try {
				VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			abnormalConditionoftheNewborn)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AbnormalConditionoftheNewbornValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									abnormalConditionoftheNewborn, context) }),
					new Object[] { abnormalConditionoftheNewborn }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbnormalConditionoftheNewbornValueP(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornValueP(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAbnormalConditionoftheNewbornValueP(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbnormalConditionoftheNewbornValueP(AbnormalConditionoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abnormalConditionoftheNewborn The receiving '<em><b>Abnormal Conditionofthe Newborn</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbnormalConditionoftheNewbornValueP(
			AbnormalConditionoftheNewborn abnormalConditionoftheNewborn, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONOFTHE_NEWBORN);
			try {
				VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			abnormalConditionoftheNewborn)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.ABNORMAL_CONDITIONOFTHE_NEWBORN__ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AbnormalConditionoftheNewbornValueP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									abnormalConditionoftheNewborn, context) }),
					new Object[] { abnormalConditionoftheNewborn }));
			}

			return false;
		}
		return true;
	}

} // AbnormalConditionoftheNewbornOperations
