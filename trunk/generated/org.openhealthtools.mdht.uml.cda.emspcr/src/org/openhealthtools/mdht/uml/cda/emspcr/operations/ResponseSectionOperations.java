/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionDelayOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Delay Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionDispatchLocationOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Dispatch Location Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionResponseOdometerReadingOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Response Odometer Reading Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionResponseModeToScene(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Response Mode To Scene</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#getDelayOrganizer() <em>Get Delay Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#getDispatchLocationOrganizer() <em>Get Dispatch Location Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#getResponseOdometerReadingOrganizer() <em>Get Response Odometer Reading Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#getResponseModeToScene() <em>Get Response Mode To Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseSectionTemplateId(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionTemplateId(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseSectionTemplateId(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionTemplateId(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseSection The receiving '<em><b>Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseSectionTemplateId(ResponseSection responseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_SECTION);
			try {
				VALIDATE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_SECTION__RESPONSE_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ResponseSectionTemplateId"), new Object[] { responseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseSectionCode(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionCode(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67664-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseSectionCode(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionCode(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseSection The receiving '<em><b>Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseSectionCode(ResponseSection responseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_SECTION);
			try {
				VALIDATE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(responseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_SECTION__RESPONSE_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("ResponseSectionCode"), new Object[] { responseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseSectionCodeP(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionCodeP(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseSectionCodeP(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionCodeP(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseSection The receiving '<em><b>Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseSectionCodeP(ResponseSection responseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_SECTION);
			try {
				VALIDATE_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_SECTION__RESPONSE_SECTION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ResponseSectionCodeP"), new Object[] { responseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseSectionTitle(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionTitle(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Response')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseSectionTitle(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionTitle(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseSection The receiving '<em><b>Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseSectionTitle(ResponseSection responseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_SECTION);
			try {
				VALIDATE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_SECTION__RESPONSE_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("ResponseSectionTitle"), new Object[] { responseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseSectionText(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionText(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseSectionText(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionText(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseSection The receiving '<em><b>Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseSectionText(ResponseSection responseSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_SECTION);
			try {
				VALIDATE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(responseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_SECTION__RESPONSE_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("ResponseSectionText"), new Object[] { responseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseSectionDelayOrganizer(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Delay Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionDelayOrganizer(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(emspcr::DelayOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseSectionDelayOrganizer(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Delay Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionDelayOrganizer(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseSection The receiving '<em><b>Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseSectionDelayOrganizer(ResponseSection responseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_SECTION);
			try {
				VALIDATE_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_SECTION__RESPONSE_SECTION_DELAY_ORGANIZER,
					EmspcrPlugin.INSTANCE.getString("ResponseSectionDelayOrganizer"), new Object[] { responseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseSectionDispatchLocationOrganizer(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Dispatch Location Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionDispatchLocationOrganizer(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(emspcr::DispatchLocationOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseSectionDispatchLocationOrganizer(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Dispatch Location Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionDispatchLocationOrganizer(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseSection The receiving '<em><b>Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseSectionDispatchLocationOrganizer(ResponseSection responseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_SECTION);
			try {
				VALIDATE_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_SECTION__RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER,
					EmspcrPlugin.INSTANCE.getString("ResponseSectionDispatchLocationOrganizer"),
					new Object[] { responseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseSectionResponseOdometerReadingOrganizer(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Response Odometer Reading Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionResponseOdometerReadingOrganizer(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(emspcr::ResponseOdometerReadingOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseSectionResponseOdometerReadingOrganizer(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Response Odometer Reading Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionResponseOdometerReadingOrganizer(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseSection The receiving '<em><b>Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseSectionResponseOdometerReadingOrganizer(ResponseSection responseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_SECTION);
			try {
				VALIDATE_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_SECTION__RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER,
					EmspcrPlugin.INSTANCE.getString("ResponseSectionResponseOdometerReadingOrganizer"),
					new Object[] { responseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseSectionResponseModeToScene(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Response Mode To Scene</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionResponseModeToScene(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ResponseModeToScene) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseSectionResponseModeToScene(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Response Mode To Scene</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseSectionResponseModeToScene(ResponseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseSection The receiving '<em><b>Response Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseSectionResponseModeToScene(ResponseSection responseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_SECTION);
			try {
				VALIDATE_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			responseSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RESPONSE_SECTION__RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE,
					EmspcrPlugin.INSTANCE.getString("ResponseSectionResponseModeToScene"),
					new Object[] { responseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDelayOrganizer(ResponseSection) <em>Get Delay Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayOrganizer(ResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DELAY_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::DelayOrganizer))->asSequence()->any(true).oclAsType(emspcr::DelayOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getDelayOrganizer(ResponseSection) <em>Get Delay Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayOrganizer(ResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DELAY_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DelayOrganizer getDelayOrganizer(ResponseSection responseSection) {
		if (GET_DELAY_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.RESPONSE_SECTION,
				EmspcrPackage.Literals.RESPONSE_SECTION.getEAllOperations().get(64));
			try {
				GET_DELAY_ORGANIZER__EOCL_QRY = helper.createQuery(GET_DELAY_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DELAY_ORGANIZER__EOCL_QRY);
		return (DelayOrganizer) query.evaluate(responseSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDispatchLocationOrganizer(ResponseSection) <em>Get Dispatch Location Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchLocationOrganizer(ResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISPATCH_LOCATION_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::DispatchLocationOrganizer))->asSequence()->any(true).oclAsType(emspcr::DispatchLocationOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getDispatchLocationOrganizer(ResponseSection) <em>Get Dispatch Location Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchLocationOrganizer(ResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISPATCH_LOCATION_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DispatchLocationOrganizer getDispatchLocationOrganizer(ResponseSection responseSection) {
		if (GET_DISPATCH_LOCATION_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.RESPONSE_SECTION,
				EmspcrPackage.Literals.RESPONSE_SECTION.getEAllOperations().get(65));
			try {
				GET_DISPATCH_LOCATION_ORGANIZER__EOCL_QRY = helper.createQuery(GET_DISPATCH_LOCATION_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISPATCH_LOCATION_ORGANIZER__EOCL_QRY);
		return (DispatchLocationOrganizer) query.evaluate(responseSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResponseOdometerReadingOrganizer(ResponseSection) <em>Get Response Odometer Reading Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseOdometerReadingOrganizer(ResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESPONSE_ODOMETER_READING_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::ResponseOdometerReadingOrganizer))->asSequence()->any(true).oclAsType(emspcr::ResponseOdometerReadingOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getResponseOdometerReadingOrganizer(ResponseSection) <em>Get Response Odometer Reading Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseOdometerReadingOrganizer(ResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESPONSE_ODOMETER_READING_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResponseOdometerReadingOrganizer getResponseOdometerReadingOrganizer(ResponseSection responseSection) {
		if (GET_RESPONSE_ODOMETER_READING_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.RESPONSE_SECTION,
				EmspcrPackage.Literals.RESPONSE_SECTION.getEAllOperations().get(66));
			try {
				GET_RESPONSE_ODOMETER_READING_ORGANIZER__EOCL_QRY = helper.createQuery(GET_RESPONSE_ODOMETER_READING_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESPONSE_ODOMETER_READING_ORGANIZER__EOCL_QRY);
		return (ResponseOdometerReadingOrganizer) query.evaluate(responseSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResponseModeToScene(ResponseSection) <em>Get Response Mode To Scene</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseModeToScene(ResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESPONSE_MODE_TO_SCENE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ResponseModeToScene))->asSequence()->any(true).oclAsType(emspcr::ResponseModeToScene)";

	/**
	 * The cached OCL query for the '{@link #getResponseModeToScene(ResponseSection) <em>Get Response Mode To Scene</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseModeToScene(ResponseSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESPONSE_MODE_TO_SCENE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResponseModeToScene getResponseModeToScene(ResponseSection responseSection) {
		if (GET_RESPONSE_MODE_TO_SCENE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.RESPONSE_SECTION,
				EmspcrPackage.Literals.RESPONSE_SECTION.getEAllOperations().get(67));
			try {
				GET_RESPONSE_MODE_TO_SCENE__EOCL_QRY = helper.createQuery(GET_RESPONSE_MODE_TO_SCENE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESPONSE_MODE_TO_SCENE__EOCL_QRY);
		return (ResponseModeToScene) query.evaluate(responseSection);
	}

} // ResponseSectionOperations
