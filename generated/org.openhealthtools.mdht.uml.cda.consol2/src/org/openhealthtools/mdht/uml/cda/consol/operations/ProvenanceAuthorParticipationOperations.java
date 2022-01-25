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
import org.eclipse.mdht.uml.cda.operations.AuthorOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provenance Author Participation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person PN Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person PN Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Authoring Device</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvenanceAuthorParticipationOperations extends AuthorOperations {

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
	protected ProvenanceAuthorParticipationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationTemplateId(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationTemplateId(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.5 .6' and id.extension = '2019-10-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationTemplateId(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationTemplateId(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProvenanceAuthorParticipationTemplateId(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProvenanceAuthorParticipationProvenanceAuthorParticipationTemplateId", "ERROR");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				provenanceAuthorParticipation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"ProvenanceAuthorParticipationProvenanceAuthorParticipationTemplateId"),
						new Object[] { provenanceAuthorParticipation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationTime(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationTime(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationTime(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationTime(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProvenanceAuthorParticipationTime(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProvenanceAuthorParticipationProvenanceAuthorParticipationTime", "ERROR");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				provenanceAuthorParticipation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_TIME,
						ConsolPlugin.INSTANCE.getString(
							"ProvenanceAuthorParticipationProvenanceAuthorParticipationTime"),
						new Object[] { provenanceAuthorParticipation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationAssignedAuthor(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationAssignedAuthor(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationAssignedAuthor(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationAssignedAuthor(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProvenanceAuthorParticipationAssignedAuthor(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProvenanceAuthorParticipationProvenanceAuthorParticipationAssignedAuthor", "ERROR");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				provenanceAuthorParticipation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR,
						ConsolPlugin.INSTANCE.getString(
							"ProvenanceAuthorParticipationProvenanceAuthorParticipationAssignedAuthor"),
						new Object[] { provenanceAuthorParticipation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person PN Family</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null).assignedPerson->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((family->isEmpty() or family->exists(element | element.isNullFlavorUndefined())) implies (family->size() =  1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person PN Family</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily",
			"ERROR");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAuthorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_FAMILY,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person PN Given</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null).assignedPerson->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((given->isEmpty() or given->exists(element | element.isNullFlavorUndefined())) implies (not given->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person PN Given</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven",
			"ERROR");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAuthorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_GIVEN,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName",
			"ERROR");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAuthorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId",
			"WARNING");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAuthorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName",
			"ERROR");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAuthorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom",
			"WARNING");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAuthorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorId(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorId(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorId(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorId(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorId(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorId", "ERROR");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAuthorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ID,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorCode(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorCode(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.111' and (value.code = 'DAUINLAW' or value.code = 'FTH' or value.code = 'DAU' or value.code = 'HPOWATT' or value.code = 'MTH' or value.code = 'SON' or value.code = 'SELF' or value.code = 'SONINLAW')))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorCode(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorCode(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorCode(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorCode", "ERROR");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAuthorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 *
	 *  The transformation to CDA does a type erasure of inner classes - this particular transformation did not pick up the base class (issue with transform)
	 *  Modified OCL manually to be cda::Person
	 *
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null)->reject(assignedPerson.oclIsTypeOf(cda::Person))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson",
			"WARNING");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAuthorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 *
	 *  The transformation to CDA does a type erasure of inner classes - this particular transformation did not pick up the base class (issue with transform)
	 *  In this case replace with CDA organization
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null)->reject(representedOrganization.oclIsTypeOf(cda::Organization))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization",
			"ERROR");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAuthorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Authoring Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null)->reject(assignedAuthoringDevice->one(assignedAuthoringDevice : cda::AuthoringDevice | not assignedAuthoringDevice.oclIsUndefined() and assignedAuthoringDevice.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Authoring Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice(ProvenanceAuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param provenanceAuthorParticipation The receiving '<em><b>Provenance Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice(
			ProvenanceAuthorParticipation provenanceAuthorParticipation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice",
			"INFO");

		if (VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			provenanceAuthorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PROVENANCE_AUTHOR_PARTICIPATION__PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE,
							ConsolPlugin.INSTANCE.getString(
								"ProvenanceAuthorParticipationProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // ProvenanceAuthorParticipationOperations
