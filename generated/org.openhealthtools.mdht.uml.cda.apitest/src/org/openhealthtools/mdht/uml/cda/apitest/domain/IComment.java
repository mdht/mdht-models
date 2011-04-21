/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IComment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>This entry allows for a comment to be supplied with each entry. For CDA this structure is usually included in the target act using the &lt;entryRelationship> element defined in the CDA Schema, but can also be used in the &lt;component> element when the comment appears within an &lt;organizer>.</p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIComment()
 * @generated
 */
public interface IComment extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Act toCDAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED getText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain exactly one [1..1] <tt><b>text</b></tt>.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setText(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::author.
	 * self.getAuthors()->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))->asSequence()->first().oclAsType(cda::Author)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Author getAuthor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>MAY</b> contain zero or one [0..1] <tt><b>author</b></tt>, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setAuthor(Author value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IComment init();
} // IComment
