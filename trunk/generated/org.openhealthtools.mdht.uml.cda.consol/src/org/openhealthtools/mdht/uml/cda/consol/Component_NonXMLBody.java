/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.NonXMLBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Non XML Body</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getComponent_NonXMLBody()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='NonXMLBodyHasReferenceOrRepresentation NonXMLBodyMediaTypeFileFormats NonXMLBodyText'"
 * @generated
 */
public interface Component_NonXMLBody extends NonXMLBody {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.reference.value.oclIsUndefined() xor ( self.text.representation = 'B64'  and (not self.text.mediaType.oclIsUndefined()) and (not self.text.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.reference.value.oclIsUndefined() xor ( self.text.representation = \'B64\'  and (not self.text.mediaType.oclIsUndefined()) and (not self.text.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateNonXMLBodyHasReferenceOrRepresentation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.mediaType.oclIsUndefined()  implies (self.text.mediaType = 'application/msword' or self.text.mediaType = 'application/pdf' or self.text.mediaType = 'text/plain' or self.text.mediaType = 'text/rtf' or self.text.mediaType = 'text/html' or self.text.mediaType = 'image/gif' or self.text.mediaType = 'image/tiff' or self.text.mediaType = 'image/jpeg' or self.text.mediaType = 'image/png')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.mediaType.oclIsUndefined()  implies (self.text.mediaType = \'application/msword\' or self.text.mediaType = \'application/pdf\' or self.text.mediaType = \'text/plain\' or self.text.mediaType = \'text/rtf\' or self.text.mediaType = \'text/html\' or self.text.mediaType = \'image/gif\' or self.text.mediaType = \'image/tiff\' or self.text.mediaType = \'image/jpeg\' or self.text.mediaType = \'image/png\')'"
	 * @generated
	 */
	boolean validateNonXMLBodyMediaTypeFileFormats(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateNonXMLBodyText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_NonXMLBody init();
} // Component_NonXMLBody
