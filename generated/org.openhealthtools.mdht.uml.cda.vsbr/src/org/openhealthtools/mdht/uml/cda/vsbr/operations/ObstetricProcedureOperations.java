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

import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Obstetric Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure#validateObstetricProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure#validateObstetricProcedureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure#validateObstetricProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure#validateObstetricProcedureNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure#validateObstetricProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure#validateObstetricProcedureCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObstetricProcedureOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected ObstetricProcedureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObstetricProcedureTemplateId(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObstetricProcedureTemplateId(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSTETRIC_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.39')";

	/**
	 * The cached OCL invariant for the '{@link #validateObstetricProcedureTemplateId(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObstetricProcedureTemplateId(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OBSTETRIC_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param obstetricProcedure The receiving '<em><b>Obstetric Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateObstetricProcedureTemplateId(ObstetricProcedure obstetricProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OBSTETRIC_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.OBSTETRIC_PROCEDURE);
			try {
				VALIDATE_OBSTETRIC_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_OBSTETRIC_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_OBSTETRIC_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(obstetricProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.OBSTETRIC_PROCEDURE__OBSTETRIC_PROCEDURE_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ObstetricProcedureObstetricProcedureTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										obstetricProcedure, context) }),
						new Object[] { obstetricProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObstetricProcedureClassCode(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObstetricProcedureClassCode(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSTETRIC_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::PROC";

	/**
	 * The cached OCL invariant for the '{@link #validateObstetricProcedureClassCode(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObstetricProcedureClassCode(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OBSTETRIC_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param obstetricProcedure The receiving '<em><b>Obstetric Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateObstetricProcedureClassCode(ObstetricProcedure obstetricProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OBSTETRIC_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.OBSTETRIC_PROCEDURE);
			try {
				VALIDATE_OBSTETRIC_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_OBSTETRIC_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_OBSTETRIC_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(obstetricProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.OBSTETRIC_PROCEDURE__OBSTETRIC_PROCEDURE_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ObstetricProcedureObstetricProcedureClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										obstetricProcedure, context) }),
						new Object[] { obstetricProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObstetricProcedureMoodCode(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObstetricProcedureMoodCode(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSTETRIC_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentProcedureMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateObstetricProcedureMoodCode(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObstetricProcedureMoodCode(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OBSTETRIC_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param obstetricProcedure The receiving '<em><b>Obstetric Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateObstetricProcedureMoodCode(ObstetricProcedure obstetricProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OBSTETRIC_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.OBSTETRIC_PROCEDURE);
			try {
				VALIDATE_OBSTETRIC_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_OBSTETRIC_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_OBSTETRIC_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(obstetricProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.OBSTETRIC_PROCEDURE__OBSTETRIC_PROCEDURE_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ObstetricProcedureObstetricProcedureMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										obstetricProcedure, context) }),
						new Object[] { obstetricProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObstetricProcedureNegationInd(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObstetricProcedureNegationInd(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSTETRIC_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateObstetricProcedureNegationInd(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObstetricProcedureNegationInd(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OBSTETRIC_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param obstetricProcedure The receiving '<em><b>Obstetric Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateObstetricProcedureNegationInd(ObstetricProcedure obstetricProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OBSTETRIC_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.OBSTETRIC_PROCEDURE);
			try {
				VALIDATE_OBSTETRIC_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_OBSTETRIC_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_OBSTETRIC_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				obstetricProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.OBSTETRIC_PROCEDURE__OBSTETRIC_PROCEDURE_NEGATION_IND,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ObstetricProcedureObstetricProcedureNegationInd",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										obstetricProcedure, context) }),
						new Object[] { obstetricProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObstetricProcedureCode(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObstetricProcedureCode(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSTETRIC_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '265636007' or value.code = '103747003' or value.code = '240278000' or value.code = '260413007'))";

	/**
	 * The cached OCL invariant for the '{@link #validateObstetricProcedureCode(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObstetricProcedureCode(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OBSTETRIC_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param obstetricProcedure The receiving '<em><b>Obstetric Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateObstetricProcedureCode(ObstetricProcedure obstetricProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OBSTETRIC_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.OBSTETRIC_PROCEDURE);
			try {
				VALIDATE_OBSTETRIC_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_OBSTETRIC_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_OBSTETRIC_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			obstetricProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.OBSTETRIC_PROCEDURE__OBSTETRIC_PROCEDURE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ObstetricProcedureObstetricProcedureCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										obstetricProcedure, context) }),
						new Object[] { obstetricProcedure }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObstetricProcedureCodeP(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObstetricProcedureCodeP(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSTETRIC_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsTypeOf(datatypes::CE))";

	/**
	 * The cached OCL invariant for the '{@link #validateObstetricProcedureCodeP(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObstetricProcedureCodeP(ObstetricProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_OBSTETRIC_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param obstetricProcedure The receiving '<em><b>Obstetric Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateObstetricProcedureCodeP(ObstetricProcedure obstetricProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OBSTETRIC_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.OBSTETRIC_PROCEDURE);
			try {
				VALIDATE_OBSTETRIC_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_OBSTETRIC_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_OBSTETRIC_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(obstetricProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.OBSTETRIC_PROCEDURE__OBSTETRIC_PROCEDURE_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ObstetricProcedureObstetricProcedureCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										obstetricProcedure, context) }),
						new Object[] { obstetricProcedure }));
			}

			return false;
		}
		return true;
	}

} // ObstetricProcedureOperations
