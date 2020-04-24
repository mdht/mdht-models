/**
 */
package org.hl7.security.ds4p.contentprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Author;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory Entry Provenance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage#getMandatoryEntryProvenance()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MandatoryEntryProvenanceTemplateId MandatoryEntryProvenanceTime MandatoryEntryProvenanceAssignedAuthor' templateId.root='2.16.840.1.113883.3.3251.1.6'"
 * @generated
 */
public interface MandatoryEntryProvenance extends Author {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.3251.1.6\')'"
	 * @generated
	 */
	boolean validateMandatoryEntryProvenanceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.time.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMandatoryEntryProvenanceTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor-&gt;one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(contentprofile::MandatoryEntryAssignedAuthor))'"
	 * @generated
	 */
	boolean validateMandatoryEntryProvenanceAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryEntryProvenance init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryEntryProvenance init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MandatoryEntryProvenance
