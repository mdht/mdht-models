/**
 */
package org.hl7.security.ds4p.contentprofile;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy Segmented Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage#getPrivacySegmentedSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PrivacySegmentedSectionTemplateId PrivacySegmentedSectionConfidentialityCode' templateId.root='2.16.840.1.113883.3.3251.1.10' confidentialityCode.codeSystem='2.16.840.1.113883.5.25' confidentialityCode.codeSystemName='ConfidentialityCode' constraints.validation.warning='PrivacySegmentedSectionConfidentialityCodeP PrivacySegmentedSectionAuthor'"
 * @generated
 */
public interface PrivacySegmentedSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.3251.1.10\')'"
	 * @generated
	 */
	boolean validatePrivacySegmentedSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.25\' and (value.code = \'N\' or value.code = \'R\' or value.code = \'V\')'"
	 * @generated
	 */
	boolean validatePrivacySegmentedSectionConfidentialityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.confidentialityCode.oclIsUndefined()'"
	 * @generated
	 */
	boolean validatePrivacySegmentedSectionConfidentialityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies author-&gt;exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(contentprofile::MandatoryEntryProvenance))'"
	 * @generated
	 */
	boolean validatePrivacySegmentedSectionAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacySegmentedSection init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PrivacySegmentedSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PrivacySegmentedSection
