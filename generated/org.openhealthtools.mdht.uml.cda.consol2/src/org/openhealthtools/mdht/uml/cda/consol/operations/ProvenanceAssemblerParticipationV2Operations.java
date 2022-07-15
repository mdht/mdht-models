/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.Participant1Operations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provenance Assembler Participation V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2FunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2FunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2Time(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address If Country Is Us Require State Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address If Country Is Us Require Postal Code Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Scoping Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvenanceAssemblerParticipationV2Operations extends Participant1Operations {

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
	protected ProvenanceAssemblerParticipationV2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2TemplateId(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2TemplateId(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.5.7' and id.extension = '2020-05-19')";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2TemplateId(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2TemplateId(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProvenanceAssemblerParticipationV2TemplateId(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2TemplateId", "ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				provenanceAssemblerParticipationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2TemplateId"),
						new Object[] { provenanceAssemblerParticipationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2FunctionCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Function Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2FunctionCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.functionCode.oclIsUndefined() or self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined() and self.functionCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in " +
			"value.code = 'assembler' and value.codeSystem = '2.16.840.1.113883.4.642.4.1131')";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2FunctionCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Function Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2FunctionCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProvenanceAssemblerParticipationV2FunctionCode(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2FunctionCode", "ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				provenanceAssemblerParticipationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2FunctionCode"),
						new Object[] { provenanceAssemblerParticipationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2FunctionCodeP(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Function Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2FunctionCodeP(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.functionCode.oclIsUndefined() or self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2FunctionCodeP(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Function Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2FunctionCodeP(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProvenanceAssemblerParticipationV2FunctionCodeP(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2FunctionCodeP", "ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				provenanceAssemblerParticipationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2FunctionCodeP"),
						new Object[] { provenanceAssemblerParticipationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2Time(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2Time(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2Time(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2Time(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProvenanceAssemblerParticipationV2Time(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2Time", "ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				provenanceAssemblerParticipationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TIME,
						ConsolPlugin.INSTANCE.getString(
							"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2Time"),
						new Object[] { provenanceAssemblerParticipationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2TypeCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2TypeCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('typeCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2TypeCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2TypeCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProvenanceAssemblerParticipationV2TypeCode(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2TypeCode", "ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				provenanceAssemblerParticipationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2TypeCode"),
						new Object[] { provenanceAssemblerParticipationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntity(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntity(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntity(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntity(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntity(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntity", "ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				provenanceAssemblerParticipationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY,
						ConsolPlugin.INSTANCE.getString(
							"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntity"),
						new Object[] { provenanceAssemblerParticipationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			"ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address If Country Is Us Require State Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() and country->exists(c : datatypes::ADXP | c.getText() = 'US') implies state->size() >= 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address If Country Is Us Require State Element</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement",
			"ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address If Country Is Us Require Postal Code Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() and country->exists(c : datatypes::ADXP | c.getText() = 'US') implies postalCode->size() >= 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address If Country Is Us Require Postal Code Element</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement",
			"ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and " +
			"let value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in " +
			"value = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse",
			"ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Use P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (( not use->isEmpty())  )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Use P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP",
			"WARNING");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (( not country->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry",
			"WARNING");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (( not state->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address State</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState",
			"WARNING");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address City</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() =  1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address City</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity",
			"ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (( not postalCode->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Postal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode",
			"WARNING");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Street Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Street Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			"ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (( not id->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId",
			"ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ID,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (( not name->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName",
			"ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_NAME,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom",
			"WARNING");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_TELECOM,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).scopingOrganization->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr",
			"WARNING");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ADDR,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityClassCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityClassCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityClassCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityClassCode(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityClassCode(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityClassCode",
			"ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_CLASS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityClassCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Scoping Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null)->reject(scopingOrganization->one(scopingOrganization : cda::Organization | not scopingOrganization.oclIsUndefined() and scopingOrganization.oclIsKindOf(cda::Organization)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Scoping Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization(ProvenanceAssemblerParticipationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAssemblerParticipationV2 The receiving '<em><b>Provenance Assembler Participation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization(
			ProvenanceAssemblerParticipationV2 provenanceAssemblerParticipationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization",
			"ERROR");

		if (VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_ASSEMBLER_PARTICIPATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAssemblerParticipationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_ASSEMBLER_PARTICIPATION_V2__PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAssemblerParticipationV2ProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // ProvenanceAssemblerParticipationV2Operations
