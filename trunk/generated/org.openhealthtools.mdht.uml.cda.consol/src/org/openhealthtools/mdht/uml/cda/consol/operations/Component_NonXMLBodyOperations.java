/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.Component_NonXMLBody;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.NonXMLBodyOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component Non XML Body</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Component_NonXMLBody#validateNonXMLBodyHasReferenceOrRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non XML Body Has Reference Or Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Component_NonXMLBody#validateNonXMLBodyMediaTypeFileFormats(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non XML Body Media Type File Formats</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Component_NonXMLBody#validateNonXMLBodyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non XML Body Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Component_NonXMLBodyOperations extends NonXMLBodyOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Component_NonXMLBodyOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonXMLBodyHasReferenceOrRepresentation(Component_NonXMLBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non XML Body Has Reference Or Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonXMLBodyHasReferenceOrRepresentation(Component_NonXMLBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_XML_BODY_HAS_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.value.oclIsUndefined() xor ( self.text.representation = 'B64'  and (not self.text.mediaType.oclIsUndefined()) and (not self.text.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonXMLBodyHasReferenceOrRepresentation(Component_NonXMLBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non XML Body Has Reference Or Representation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonXMLBodyHasReferenceOrRepresentation(Component_NonXMLBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_XML_BODY_HAS_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.reference.value.oclIsUndefined() xor ( self.text.representation = 'B64'  and (not self.text.mediaType.oclIsUndefined()) and (not self.text.oclIsUndefined()))
	 * @param component_NonXMLBody The receiving '<em><b>Component Non XML Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonXMLBodyHasReferenceOrRepresentation(Component_NonXMLBody component_NonXMLBody,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NON_XML_BODY_HAS_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_NON_XML_BODY);
			try {
				VALIDATE_NON_XML_BODY_HAS_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_XML_BODY_HAS_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_XML_BODY_HAS_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			component_NonXMLBody)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMPONENT_NON_XML_BODY__NON_XML_BODY_HAS_REFERENCE_OR_REPRESENTATION,
					ConsolPlugin.INSTANCE.getString("NonXMLBodyHasReferenceOrRepresentation"),
					new Object[] { component_NonXMLBody }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonXMLBodyMediaTypeFileFormats(Component_NonXMLBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non XML Body Media Type File Formats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonXMLBodyMediaTypeFileFormats(Component_NonXMLBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.mediaType.oclIsUndefined()  implies (self.text.mediaType = 'application/msword' or self.text.mediaType = 'application/pdf' or self.text.mediaType = 'text/plain' or self.text.mediaType = 'text/rtf' or self.text.mediaType = 'text/html' or self.text.mediaType = 'image/gif' or self.text.mediaType = 'image/tiff' or self.text.mediaType = 'image/jpeg' or self.text.mediaType = 'image/png')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonXMLBodyMediaTypeFileFormats(Component_NonXMLBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non XML Body Media Type File Formats</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonXMLBodyMediaTypeFileFormats(Component_NonXMLBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.mediaType.oclIsUndefined()  implies (self.text.mediaType = 'application/msword' or self.text.mediaType = 'application/pdf' or self.text.mediaType = 'text/plain' or self.text.mediaType = 'text/rtf' or self.text.mediaType = 'text/html' or self.text.mediaType = 'image/gif' or self.text.mediaType = 'image/tiff' or self.text.mediaType = 'image/jpeg' or self.text.mediaType = 'image/png')
	 * @param component_NonXMLBody The receiving '<em><b>Component Non XML Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonXMLBodyMediaTypeFileFormats(Component_NonXMLBody component_NonXMLBody,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_NON_XML_BODY);
			try {
				VALIDATE_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			component_NonXMLBody)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMPONENT_NON_XML_BODY__NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS,
					ConsolPlugin.INSTANCE.getString("NonXMLBodyMediaTypeFileFormats"),
					new Object[] { component_NonXMLBody }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonXMLBodyText(Component_NonXMLBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non XML Body Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonXMLBodyText(Component_NonXMLBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonXMLBodyText(Component_NonXMLBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non XML Body Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonXMLBodyText(Component_NonXMLBody, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param component_NonXMLBody The receiving '<em><b>Component Non XML Body</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonXMLBodyText(Component_NonXMLBody component_NonXMLBody,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_NON_XML_BODY);
			try {
				VALIDATE_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			component_NonXMLBody)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMPONENT_NON_XML_BODY__NON_XML_BODY_TEXT,
					ConsolPlugin.INSTANCE.getString("NonXMLBodyText"), new Object[] { component_NonXMLBody }));
			}
			return false;
		}
		return true;
	}

} // Component_NonXMLBodyOperations
