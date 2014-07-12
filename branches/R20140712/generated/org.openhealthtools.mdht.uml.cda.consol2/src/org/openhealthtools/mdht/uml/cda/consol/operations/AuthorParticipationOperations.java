/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.AuthorOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Author Participation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorRepresentedOrganizationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorRepresentedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorParticipationOperations extends AuthorOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorParticipationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationTemplateId(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationTemplateId(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.119')";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationTemplateId(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationTemplateId(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAuthorParticipationTemplateId(AuthorParticipation authorParticipation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				VALIDATE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authorParticipation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AuthorParticipationTemplateId"),
					new Object[] { authorParticipation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationTime(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationTime(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationTime(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationTime(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAuthorParticipationTime(AuthorParticipation authorParticipation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				VALIDATE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authorParticipation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_TIME,
					ConsolPlugin.INSTANCE.getString("AuthorParticipationTime"), new Object[] { authorParticipation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationAssignedAuthor(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthor(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor))";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationAssignedAuthor(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthor(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAuthorParticipationAssignedAuthor(AuthorParticipation authorParticipation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authorParticipation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR,
					ConsolPlugin.INSTANCE.getString("AuthorParticipationAssignedAuthor"),
					new Object[] { authorParticipation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationAssignedAuthorAssignedPersonName(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Assigned Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorAssignedPersonName(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationAssignedAuthorAssignedPersonName(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Assigned Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorAssignedPersonName(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAuthorParticipationAssignedAuthorAssignedPersonName(
			AuthorParticipation authorParticipation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(authorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("AuthorParticipationAssignedAuthorAssignedPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationAssignedAuthorRepresentedOrganizationClassCode(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorRepresentedOrganizationClassCode(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClassOrganization::ORG)";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationAssignedAuthorRepresentedOrganizationClassCode(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorRepresentedOrganizationClassCode(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationClassCode(
			AuthorParticipation authorParticipation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(authorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("AuthorParticipationAssignedAuthorRepresentedOrganizationClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationAssignedAuthorRepresentedOrganizationId(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorRepresentedOrganizationId(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationAssignedAuthorRepresentedOrganizationId(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorRepresentedOrganizationId(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationId(
			AuthorParticipation authorParticipation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(authorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID,
						ConsolPlugin.INSTANCE.getString("AuthorParticipationAssignedAuthorRepresentedOrganizationId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationAssignedAuthorRepresentedOrganizationName(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorRepresentedOrganizationName(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationAssignedAuthorRepresentedOrganizationName(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorRepresentedOrganizationName(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationName(
			AuthorParticipation authorParticipation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(authorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME,
						ConsolPlugin.INSTANCE.getString("AuthorParticipationAssignedAuthorRepresentedOrganizationName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom(
			AuthorParticipation authorParticipation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(authorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM,
						ConsolPlugin.INSTANCE.getString("AuthorParticipationAssignedAuthorRepresentedOrganizationTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null).representedOrganization->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr(
			AuthorParticipation authorParticipation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(authorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ADDR,
						ConsolPlugin.INSTANCE.getString("AuthorParticipationAssignedAuthorRepresentedOrganizationAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationAssignedAuthorId(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorId(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationAssignedAuthorId(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorId(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAuthorParticipationAssignedAuthorId(AuthorParticipation authorParticipation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(authorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ID,
						ConsolPlugin.INSTANCE.getString("AuthorParticipationAssignedAuthorId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationAssignedAuthorCodeP(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorCodeP(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationAssignedAuthorCodeP(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorCodeP(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAuthorParticipationAssignedAuthorCodeP(AuthorParticipation authorParticipation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(authorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE_P,
						ConsolPlugin.INSTANCE.getString("AuthorParticipationAssignedAuthorCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.AuthorParticipationAssignedAuthorCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.AuthorParticipationAssignedAuthorCodeP", passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationAssignedAuthorCode(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorCode(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationAssignedAuthorCode(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorCode(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAuthorParticipationAssignedAuthorCode(AuthorParticipation authorParticipation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(authorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.AuthorParticipationAssignedAuthorCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE,
						ConsolPlugin.INSTANCE.getString("AuthorParticipationAssignedAuthorCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationAssignedAuthorAssignedPerson(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorAssignedPerson(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationAssignedAuthorAssignedPerson(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorAssignedPerson(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAuthorParticipationAssignedAuthorAssignedPerson(
			AuthorParticipation authorParticipation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(authorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON,
						ConsolPlugin.INSTANCE.getString("AuthorParticipationAssignedAuthorAssignedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthorParticipationAssignedAuthorRepresentedOrganization(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorRepresentedOrganization(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthorParticipationAssignedAuthorRepresentedOrganization(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthorParticipationAssignedAuthorRepresentedOrganization(AuthorParticipation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param authorParticipation The receiving '<em><b>Author Participation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAuthorParticipationAssignedAuthorRepresentedOrganization(
			AuthorParticipation authorParticipation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHOR_PARTICIPATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(authorParticipation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.AUTHOR_PARTICIPATION__AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("AuthorParticipationAssignedAuthorRepresentedOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // AuthorParticipationOperations
