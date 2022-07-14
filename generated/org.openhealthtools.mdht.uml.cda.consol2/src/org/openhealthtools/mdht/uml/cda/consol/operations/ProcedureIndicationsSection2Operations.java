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
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Indications Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2#validateProcedureIndicationsSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2#validateProcedureIndicationsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2#validateProcedureIndicationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2#validateProcedureIndicationsSectionIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Indication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureIndicationsSection2Operations extends ProcedureIndicationsSectionOperations {
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
	protected ProcedureIndicationsSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureIndicationsSection2TemplateId(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureIndicationsSection2TemplateId(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_INDICATIONS_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.29' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureIndicationsSection2TemplateId(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureIndicationsSection2TemplateId(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_INDICATIONS_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureIndicationsSection2 The receiving '<em><b>Procedure Indications Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureIndicationsSection2TemplateId(
			ProcedureIndicationsSection2 procedureIndicationsSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProcedureIndicationsSection2ProcedureIndicationsSection2TemplateId", "ERROR");

		if (VALIDATE_PROCEDURE_INDICATIONS_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_INDICATIONS_SECTION2);
			try {
				VALIDATE_PROCEDURE_INDICATIONS_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_INDICATIONS_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_INDICATIONS_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureIndicationsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_INDICATIONS_SECTION2__PROCEDURE_INDICATIONS_SECTION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureIndicationsSection2ProcedureIndicationsSection2TemplateId"),
						new Object[] { procedureIndicationsSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolIndication2s(ProcedureIndicationsSection2) <em>Get Consol Indication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolIndication2s(ProcedureIndicationsSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INDICATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)";

	/**
	 * The cached OCL query for the '{@link #getConsolIndication2s(ProcedureIndicationsSection2) <em>Get Consol Indication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolIndication2s(ProcedureIndicationsSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INDICATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication2> getConsolIndication2s(ProcedureIndicationsSection2 procedureIndicationsSection2) {

		if (GET_CONSOL_INDICATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_INDICATIONS_SECTION2,
				ConsolPackage.Literals.PROCEDURE_INDICATIONS_SECTION2.getEAllOperations().get(63));
			try {
				GET_CONSOL_INDICATION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_INDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_INDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication2> result = (Collection<Indication2>) query.evaluate(procedureIndicationsSection2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureIndicationsSectionCodeP(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureIndicationsSectionCodeP(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureIndicationsSectionCodeP(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureIndicationsSectionCodeP(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureIndicationsSection2 The receiving '<em><b>Procedure Indications Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureIndicationsSectionCodeP(
			ProcedureIndicationsSection2 procedureIndicationsSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProcedureIndicationsSection2ProcedureIndicationsSectionCodeP", "ERROR");

		if (VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_INDICATIONS_SECTION2);
			try {
				VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureIndicationsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_INDICATIONS_SECTION2__PROCEDURE_INDICATIONS_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("ProcedureIndicationsSection2ProcedureIndicationsSectionCodeP"),
						new Object[] { procedureIndicationsSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSectionCodeP", passToken);
				}
				passToken.add(procedureIndicationsSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureIndicationsSectionCode(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureIndicationsSectionCode(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '59768-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureIndicationsSectionCode(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureIndicationsSectionCode(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureIndicationsSection2 The receiving '<em><b>Procedure Indications Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureIndicationsSectionCode(
			ProcedureIndicationsSection2 procedureIndicationsSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSectionCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(procedureIndicationsSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ProcedureIndicationsSection2ProcedureIndicationsSectionCode", "ERROR");

		if (VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_INDICATIONS_SECTION2);
			try {
				VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureIndicationsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_INDICATIONS_SECTION2__PROCEDURE_INDICATIONS_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("ProcedureIndicationsSection2ProcedureIndicationsSectionCode"),
						new Object[] { procedureIndicationsSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureIndicationsSectionIndication(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureIndicationsSectionIndication(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_INDICATIONS_SECTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::Indication2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureIndicationsSectionIndication(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureIndicationsSectionIndication(ProcedureIndicationsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURE_INDICATIONS_SECTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureIndicationsSection2 The receiving '<em><b>Procedure Indications Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureIndicationsSectionIndication(
			ProcedureIndicationsSection2 procedureIndicationsSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProcedureIndicationsSection2ProcedureIndicationsSectionIndication", "INFO");

		if (VALIDATE_PROCEDURE_INDICATIONS_SECTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_INDICATIONS_SECTION2);
			try {
				VALIDATE_PROCEDURE_INDICATIONS_SECTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROCEDURE_INDICATIONS_SECTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROCEDURE_INDICATIONS_SECTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				procedureIndicationsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_INDICATIONS_SECTION2__PROCEDURE_INDICATIONS_SECTION_INDICATION,
						ConsolPlugin.INSTANCE.getString(
							"ProcedureIndicationsSection2ProcedureIndicationsSectionIndication"),
						new Object[] { procedureIndicationsSection2 }));
			}

			return false;
		}
		return true;
	}

} // ProcedureIndicationsSection2Operations
