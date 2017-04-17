/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Pedigree</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree#validateFamilyHistoryPedigreeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree#validateFamilyHistoryPedigreeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree#validateFamilyHistoryPedigreeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree#validateFamilyHistoryPedigreeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree#validateFamilyHistoryPedigreeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree#validateFamilyHistoryPedigreeReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree#validateFamilyHistoryPedigreeReferenceExternalObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference External Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree#validateFamilyHistoryPedigreeReferenceExternalObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference External Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree#validateFamilyHistoryPedigreeReferenceExternalObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference External Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree#validateFamilyHistoryPedigreeReferenceExternalObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference External Observation Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryPedigreeOperations extends ClinicalStatementOperations {
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
	protected FamilyHistoryPedigreeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryPedigreeTemplateId(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeTemplateId(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_PEDIGREE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.48')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryPedigreeTemplateId(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeTemplateId(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_PEDIGREE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryPedigree The receiving '<em><b>Family History Pedigree</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryPedigreeTemplateId(FamilyHistoryPedigree familyHistoryPedigree,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_PEDIGREE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryPedigree());
			try {
				VALIDATE_FAMILY_HISTORY_PEDIGREE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_PEDIGREE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_PEDIGREE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryPedigree)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryPedigreeFamilyHistoryPedigreeTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryPedigree, context) }),
						new Object[] { familyHistoryPedigree }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryPedigreeClassCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeClassCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_PEDIGREE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryPedigreeClassCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeClassCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_PEDIGREE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryPedigree The receiving '<em><b>Family History Pedigree</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryPedigreeClassCode(FamilyHistoryPedigree familyHistoryPedigree,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_PEDIGREE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryPedigree());
			try {
				VALIDATE_FAMILY_HISTORY_PEDIGREE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_PEDIGREE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_PEDIGREE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryPedigree)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryPedigreeFamilyHistoryPedigreeClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryPedigree, context) }),
						new Object[] { familyHistoryPedigree }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryPedigreeCodeP(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeCodeP(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_PEDIGREE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryPedigreeCodeP(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeCodeP(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_PEDIGREE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryPedigree The receiving '<em><b>Family History Pedigree</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryPedigreeCodeP(FamilyHistoryPedigree familyHistoryPedigree,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_PEDIGREE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryPedigree());
			try {
				VALIDATE_FAMILY_HISTORY_PEDIGREE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FAMILY_HISTORY_PEDIGREE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_PEDIGREE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryPedigree)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryPedigreeFamilyHistoryPedigreeCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryPedigree, context) }),
						new Object[] { familyHistoryPedigree }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryPedigreeCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_PEDIGREE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '10157-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryPedigreeCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_PEDIGREE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryPedigree The receiving '<em><b>Family History Pedigree</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryPedigreeCode(FamilyHistoryPedigree familyHistoryPedigree,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_PEDIGREE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryPedigree());
			try {
				VALIDATE_FAMILY_HISTORY_PEDIGREE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FAMILY_HISTORY_PEDIGREE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_PEDIGREE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(familyHistoryPedigree)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryPedigreeFamilyHistoryPedigreeCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryPedigree, context) }),
						new Object[] { familyHistoryPedigree }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryPedigreeMoodCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeMoodCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_PEDIGREE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryPedigreeMoodCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeMoodCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_PEDIGREE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryPedigree The receiving '<em><b>Family History Pedigree</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryPedigreeMoodCode(FamilyHistoryPedigree familyHistoryPedigree,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_PEDIGREE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryPedigree());
			try {
				VALIDATE_FAMILY_HISTORY_PEDIGREE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FAMILY_HISTORY_PEDIGREE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_PEDIGREE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryPedigree)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryPedigreeFamilyHistoryPedigreeMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryPedigree, context) }),
						new Object[] { familyHistoryPedigree }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryPedigreeReference(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeReference(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->one(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryPedigreeReference(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeReference(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryPedigree The receiving '<em><b>Family History Pedigree</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryPedigreeReference(FamilyHistoryPedigree familyHistoryPedigree,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryPedigree());
			try {
				VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryPedigree)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_REFERENCE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryPedigreeFamilyHistoryPedigreeReference",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryPedigree, context) }),
						new Object[] { familyHistoryPedigree }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryPedigreeReferenceExternalObservationClassCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference External Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeReferenceExternalObservationClassCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalObservation->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryPedigreeReferenceExternalObservationClassCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference External Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeReferenceExternalObservationClassCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryPedigree The receiving '<em><b>Family History Pedigree</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryPedigreeReferenceExternalObservationClassCode(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryPedigree());
			try {
				VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryPedigree)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryPedigreeFamilyHistoryPedigreeReferenceExternalObservationClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryPedigree, context) }),
						new Object[] { familyHistoryPedigree }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryPedigreeReferenceExternalObservationId(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference External Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeReferenceExternalObservationId(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalObservation->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryPedigreeReferenceExternalObservationId(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference External Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeReferenceExternalObservationId(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryPedigree The receiving '<em><b>Family History Pedigree</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryPedigreeReferenceExternalObservationId(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryPedigree());
			try {
				VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryPedigree)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryPedigreeFamilyHistoryPedigreeReferenceExternalObservationId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryPedigree, context) }),
						new Object[] { familyHistoryPedigree }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryPedigreeReferenceExternalObservationMoodCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference External Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeReferenceExternalObservationMoodCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalObservation->excluding(null)->reject(isDefined('moodCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryPedigreeReferenceExternalObservationMoodCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference External Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeReferenceExternalObservationMoodCode(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryPedigree The receiving '<em><b>Family History Pedigree</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryPedigreeReferenceExternalObservationMoodCode(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryPedigree());
			try {
				VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryPedigree)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryPedigreeFamilyHistoryPedigreeReferenceExternalObservationMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryPedigree, context) }),
						new Object[] { familyHistoryPedigree }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryPedigreeReferenceExternalObservationText(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference External Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeReferenceExternalObservationText(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalObservation->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryPedigreeReferenceExternalObservationText(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Pedigree Reference External Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryPedigreeReferenceExternalObservationText(FamilyHistoryPedigree, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryPedigree The receiving '<em><b>Family History Pedigree</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryPedigreeReferenceExternalObservationText(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistoryPedigree());
			try {
				VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryPedigree)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_TEXT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistoryPedigreeFamilyHistoryPedigreeReferenceExternalObservationText",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistoryPedigree, context) }),
						new Object[] { familyHistoryPedigree }));
			}

			return false;
		}
		return true;
	}

} // FamilyHistoryPedigreeOperations
