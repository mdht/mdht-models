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
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#getConsolProcedureActivityProcedure2s() <em>Get Consol Procedure Activity Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#getConsolProcedureActivityObservation2s() <em>Get Consol Procedure Activity Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#getConsolProcedureActivityAct2s() <em>Get Consol Procedure Activity Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalProcedureActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalProcedureActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProceduresSectionEntriesOptional2Operations extends ProceduresSectionEntriesOptionalOperations {
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
	protected ProceduresSectionEntriesOptional2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolProcedureActivityProcedure2s(ProceduresSectionEntriesOptional2) <em>Get Consol Procedure Activity Procedure2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProcedureActivityProcedure2s(ProceduresSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)).oclAsType(consol::ProcedureActivityProcedure2)";

	/**
	 * The cached OCL query for the '{@link #getConsolProcedureActivityProcedure2s(ProceduresSectionEntriesOptional2) <em>Get Consol Procedure Activity Procedure2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProcedureActivityProcedure2s(ProceduresSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProcedureActivityProcedure2> getConsolProcedureActivityProcedure2s(
			ProceduresSectionEntriesOptional2 proceduresSectionEntriesOptional2) {

		if (GET_CONSOL_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL2,
				ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL2.getEAllOperations().get(66));
			try {
				GET_CONSOL_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityProcedure2> result = (Collection<ProcedureActivityProcedure2>) query.evaluate(
			proceduresSectionEntriesOptional2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolProcedureActivityObservation2s(ProceduresSectionEntriesOptional2) <em>Get Consol Procedure Activity Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProcedureActivityObservation2s(ProceduresSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProcedureActivityObservation2)).oclAsType(consol::ProcedureActivityObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolProcedureActivityObservation2s(ProceduresSectionEntriesOptional2) <em>Get Consol Procedure Activity Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProcedureActivityObservation2s(ProceduresSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProcedureActivityObservation2> getConsolProcedureActivityObservation2s(
			ProceduresSectionEntriesOptional2 proceduresSectionEntriesOptional2) {

		if (GET_CONSOL_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL2,
				ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL2.getEAllOperations().get(67));
			try {
				GET_CONSOL_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PROCEDURE_ACTIVITY_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityObservation2> result = (Collection<ProcedureActivityObservation2>) query.evaluate(
			proceduresSectionEntriesOptional2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolProcedureActivityAct2s(ProceduresSectionEntriesOptional2) <em>Get Consol Procedure Activity Act2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProcedureActivityAct2s(ProceduresSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PROCEDURE_ACTIVITY_ACT2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProcedureActivityAct2)).oclAsType(consol::ProcedureActivityAct2)";

	/**
	 * The cached OCL query for the '{@link #getConsolProcedureActivityAct2s(ProceduresSectionEntriesOptional2) <em>Get Consol Procedure Activity Act2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProcedureActivityAct2s(ProceduresSectionEntriesOptional2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PROCEDURE_ACTIVITY_ACT2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProcedureActivityAct2> getConsolProcedureActivityAct2s(
			ProceduresSectionEntriesOptional2 proceduresSectionEntriesOptional2) {

		if (GET_CONSOL_PROCEDURE_ACTIVITY_ACT2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL2,
				ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL2.getEAllOperations().get(68));
			try {
				GET_CONSOL_PROCEDURE_ACTIVITY_ACT2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_PROCEDURE_ACTIVITY_ACT2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PROCEDURE_ACTIVITY_ACT2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityAct2> result = (Collection<ProcedureActivityAct2>) query.evaluate(
			proceduresSectionEntriesOptional2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.7' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSectionEntriesOptional2 The receiving '<em><b>Procedures Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProceduresSectionEntriesOptionalTemplateId(
			ProceduresSectionEntriesOptional2 proceduresSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProceduresSectionEntriesOptional2ProceduresSectionEntriesOptionalTemplateId", "ERROR");

		if (VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				proceduresSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURES_SECTION_ENTRIES_OPTIONAL2__PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"ProceduresSectionEntriesOptional2ProceduresSectionEntriesOptionalTemplateId"),
						new Object[] { proceduresSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionEntriesOptionalCodeP(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalCodeP(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionEntriesOptionalCodeP(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalCodeP(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSectionEntriesOptional2 The receiving '<em><b>Procedures Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProceduresSectionEntriesOptionalCodeP(
			ProceduresSectionEntriesOptional2 proceduresSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProceduresSectionEntriesOptional2ProceduresSectionEntriesOptionalCodeP", "ERROR");

		if (VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				proceduresSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURES_SECTION_ENTRIES_OPTIONAL2__PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"ProceduresSectionEntriesOptional2ProceduresSectionEntriesOptionalCodeP"),
						new Object[] { proceduresSectionEntriesOptional2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptionalCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptionalCodeP", passToken);
				}
				passToken.add(proceduresSectionEntriesOptional2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionEntriesOptionalCode(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalCode(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '47519-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionEntriesOptionalCode(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalCode(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSectionEntriesOptional2 The receiving '<em><b>Procedures Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProceduresSectionEntriesOptionalCode(
			ProceduresSectionEntriesOptional2 proceduresSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptionalCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(proceduresSectionEntriesOptional2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(
			context, "ProceduresSectionEntriesOptional2ProceduresSectionEntriesOptionalCode", "ERROR");

		if (VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				proceduresSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURES_SECTION_ENTRIES_OPTIONAL2__PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProceduresSectionEntriesOptional2ProceduresSectionEntriesOptionalCode"),
						new Object[] { proceduresSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionEntriesOptionalProcedureActivityProcedure(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalProcedureActivityProcedure(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::ProcedureActivityProcedure2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionEntriesOptionalProcedureActivityProcedure(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalProcedureActivityProcedure(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSectionEntriesOptional2 The receiving '<em><b>Procedures Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProceduresSectionEntriesOptionalProcedureActivityProcedure(
			ProceduresSectionEntriesOptional2 proceduresSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProceduresSectionEntriesOptional2ProceduresSectionEntriesOptionalProcedureActivityProcedure",
			"INFO");

		if (VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				proceduresSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURES_SECTION_ENTRIES_OPTIONAL2__PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_PROCEDURE,
						ConsolPlugin.INSTANCE.getString(
							"ProceduresSectionEntriesOptional2ProceduresSectionEntriesOptionalProcedureActivityProcedure"),
						new Object[] { proceduresSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionEntriesOptionalProcedureActivityObservation(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalProcedureActivityObservation(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ProcedureActivityObservation2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionEntriesOptionalProcedureActivityObservation(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalProcedureActivityObservation(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSectionEntriesOptional2 The receiving '<em><b>Procedures Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProceduresSectionEntriesOptionalProcedureActivityObservation(
			ProceduresSectionEntriesOptional2 proceduresSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProceduresSectionEntriesOptional2ProceduresSectionEntriesOptionalProcedureActivityObservation",
			"INFO");

		if (VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				proceduresSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURES_SECTION_ENTRIES_OPTIONAL2__PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"ProceduresSectionEntriesOptional2ProceduresSectionEntriesOptionalProcedureActivityObservation"),
						new Object[] { proceduresSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresSectionEntriesOptionalProcedureActivityAct(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalProcedureActivityAct(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ProcedureActivityAct2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresSectionEntriesOptionalProcedureActivityAct(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresSectionEntriesOptionalProcedureActivityAct(ProceduresSectionEntriesOptional2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresSectionEntriesOptional2 The receiving '<em><b>Procedures Section Entries Optional2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProceduresSectionEntriesOptionalProcedureActivityAct(
			ProceduresSectionEntriesOptional2 proceduresSectionEntriesOptional2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProceduresSectionEntriesOptional2ProceduresSectionEntriesOptionalProcedureActivityAct", "INFO");

		if (VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL2);
			try {
				VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				proceduresSectionEntriesOptional2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURES_SECTION_ENTRIES_OPTIONAL2__PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_ACT,
						ConsolPlugin.INSTANCE.getString(
							"ProceduresSectionEntriesOptional2ProceduresSectionEntriesOptionalProcedureActivityAct"),
						new Object[] { proceduresSectionEntriesOptional2 }));
			}

			return false;
		}
		return true;
	}

} // ProceduresSectionEntriesOptional2Operations
